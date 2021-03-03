package commands;

import lab.FileManager;

public class CommandRemoveGreaterKey {
    public static void remove_greater_key(FileManager man, Long argument) {
        int startSize = man.getCollection().size();
        if (startSize != 0) {
            int cout = 0;
            for (Long key : man.getCollection().keySet()) {
                if (key > argument) man.getCollection().remove(argument);
                cout++;
            }
            if (cout > 0) {
                System.out.println(cout + "keys(with elements) were deleted");
            } else System.out.println("Collection wasn't changed");

        } else System.out.println("Collection is empty.");
    }
}
