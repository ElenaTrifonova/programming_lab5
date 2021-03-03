package commands;

import lab.FileManager;

public class CommandRemoveKey {
    public static void remove_key(FileManager man, Long argument) {
        System.out.println("Avaliable keys:" + man.getCollection().keys());
        int startSize = man.getCollection().size();
        man.getCollection().remove(argument);
        if (startSize == man.getCollection().size()) {
            System.out.println("Element wasn't deleted. Maybe key isn't exist.");
        } else {
            System.out.println("Element was deleted.");
        }
    }
}
