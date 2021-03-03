package commands;

import collection.OrgGeneration;
import collection.Organization;
import lab.FileManager;

public class CommandInsert {
    public static void insert(FileManager man, Long argument) {
        int cout = 0;
        if (man.getCollection().size() > 0) {
            for (Long key : man.getCollection().keySet()) {
                if (key.equals(argument)) {
                    cout++;
                    System.out.println("The same key already exists. You can change it or use command 'update'");
                }
            }
        }
        if (cout == 0) {
            System.out.println("Enter the values of elements:");
            Organization org = OrgGeneration.generate();
            man.getCollection().put(argument, org);
            System.out.println("Key and elements was added to the collection.");
        }
    }
}
