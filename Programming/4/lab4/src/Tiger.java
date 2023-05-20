public class Tiger extends Animal{
    Tiger(String name, int ves) throws MyException {
        super(name, ves);
    }
    public void climing(Mouse mouse){
        Climb climb = new Climb() {
            public int height = 0;
            Tree tree = new Tree();
            @Override
            public void climbing() {
                mouse.say("Можеш поднятся на дерево?");
                for (int i = 0; i < tree.vetky.length; i++) {
                    System.out.println(Tiger.super.getName() + " поднялся на высату " + height);
                    if(tree.vetky[i].check(Tiger.super.getVes())) {
                        height += 5;
                        mouse.say("А ещё сможешь?");
                    }
                    else {
                        height -= 5;
                        System.out.println(Tiger.super.getName() + " едва-едва успел вцепиться в нижную ветку");
                        break;
                    }
                }
                height += 5;
            }
        };
        climb.climbing();
    }
}
