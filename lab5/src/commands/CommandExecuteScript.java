package commands;

import lab.FileManager;

import java.io.IOException;
import java.util.ArrayList;

public class CommandExecuteScript {
    public static void execute_script(FileManager manFile, String file) throws IOException {
        if (ScriptReader.checkFile(file) != null) {
            ArrayList<String> commandsScript = ScriptReader.readCommand(file);
            for (String command : commandsScript) {
                if (command.split(" ").length == 2 && command.split(" ")[0].equals("execute_script") && command.split(" ")[1].equals(file)) {
                    throw new IllegalArgumentException("Recursion of scripts!");
                }
                CommandManager manCommand= new CommandManager();
                manCommand.interactive_mode(manFile);
            }
        }
    }
}
