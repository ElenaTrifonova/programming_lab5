package commands;

import collection.OrgGeneration;
import collection.Organization;
import lab.FileManager;

import java.util.Hashtable;

public class CommandUpdateID {
    public static void update(FileManager man, Long id) {
        if (man.getCollection().size() > 0) {
            int cout = 0;
            for (Organization org : man.getCollection().values()) {
                if (org.getId().equals(id)) {
                    cout++;
                    org = OrgGeneration.generate();
                    man.getCollection().put(id, org);


                    /*Hashtable<Long, Organization> newCollection;
                    newCollection = man.getCollection();
                    newCollection.put(id, org);
                    System.out.println("Collection was update");
                    man.save(newCollection);**/
                }
            }
            if (cout == 0) {
                System.out.println("There are no same id in the collection. Collection wasn't update");
            } else System.out.println("Collection was update" + cout + "time");

        } else System.out.println("Collection is empty");
    }
}
