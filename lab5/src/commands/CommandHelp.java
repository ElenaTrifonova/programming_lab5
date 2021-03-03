package commands;

public class CommandHelp {
    public static void help(){
        System.out.println("Information about available commands:");
        for(CommandVariants var: CommandVariants.values()){
            System.out.println(var.getName());
        }
    }
}
