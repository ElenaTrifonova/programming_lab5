package commands;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ScriptReader {

    public static ArrayList<String> readCommand(String file){
        ArrayList<String> commands = new ArrayList<>();
        try {
            FileReader reader = new FileReader(file);
            BufferedReader byfferedReader = new BufferedReader(reader);
            String line;
            while (byfferedReader.readLine()!=null){
                line = byfferedReader.readLine();
                commands.add(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return commands;
    }

    public static File checkFile(String filePath) {
        File script = new File(filePath);

        if (!script.exists() || !script.isFile()) {
            System.out.println(("File with path " + script.getAbsolutePath() + " doesn't exist."));
            return null;
        }
        if (!script.canRead()) {
            System.out.println("File is protected from reading.");
            return null;
        }
        if (script.length() == 0) {
            System.out.println("There is no command in the script.");
            return null;
        }
        return script;
    }

}
