package commands;

import collection.Organization;
import lab.FileManager;

public class CommandClear {

    public static void clear(FileManager man){
        if (man.getCollection().size() == 0) {
            System.out.println("Collection is already empty");
        } else {
            man.getCollection().clear();
            System.out.println("Collection was cleared");
        }
    }

}
