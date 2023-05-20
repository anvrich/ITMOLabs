public class Tree {
    private int age;
    class Branch{
        private int ves;
        private int height;
        private boolean broken = false;
        Branch(int ves, int height) {
            this.ves = ves;
            this.height = height;
        }
        public boolean check(int ves) {
            if(!broken) {
                if(ves > this.ves) {
                    broken = true;
                    System.out.println("Ветка сломалась!");
                    return false;
                }
                else {
                    return true;
                }
            }
            else return false;
        }
    }
    public Branch[] vetky = {new Branch(30, 5), new Branch(30, 10), new Branch(20, 15)};
}