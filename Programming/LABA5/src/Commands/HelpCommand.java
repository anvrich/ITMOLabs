package Commands;

public class HelpCommand {
    public static void help(){
        for (String s : PersonCollection.manual.keySet()){
            System.out.println(s + ": " + PersonCollection.manual.get(s));
        }
    }
}

