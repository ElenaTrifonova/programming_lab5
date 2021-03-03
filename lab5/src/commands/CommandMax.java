package commands;

import collection.Organization;
import lab.FileManager;

import java.time.LocalDateTime;
import java.util.Hashtable;


public class CommandMax {
    public static void max(FileManager man) {
        LocalDateTime max = null;
        long maxKey = 0;
        if (man.getCollection().size() > 0) {
            for (Organization org : man.getCollection().values()) {
                if (org.getCreationDate().compareTo(max) == 1) maxKey = org.getId();
            }
            System.out.println("Information about organization with max creation date:" + man.getCollection().get(maxKey).toString() ); //ВОПРОС ПРО ВЫВОД
        } else System.out.println("Collection is empty.");
    }
}
