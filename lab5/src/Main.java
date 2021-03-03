import collection.OrgGeneration;
import collection.Organization;
import commands.CommandManager;
import lab.FileManager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;

public class Main{
    public static void main(String [] args) throws IOException {
        String filepath = System.getenv("FilePath");
        Organization org = OrgGeneration.generate();
        Hashtable<Long, Organization> collection = new Hashtable<>();
        collection.put(1L, org);

        FileManager manFile = new FileManager();

        manFile.save(collection);

        manFile.loadCollection(filepath);



        System.out.println(manFile.getCollection());

        CommandManager manCommand = new CommandManager();

        manCommand.interactive_mode(manFile);


    }
}