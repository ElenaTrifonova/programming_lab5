package commands;

import collection.Organization;
import lab.FileManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class CommandRemoveGreater {
    public static void remove_greater(FileManager man, Long argument){
        int startSize = man.getCollection().size();
        if (startSize>0){
            Object[] array = man.getCollection().keySet().toArray();
            int cout = 0;
            int cout_del = 0;
            for (Organization org: man.getCollection().values()){
                cout++;
                Object key = array[cout];
                if (org.getId() > argument) {
                    cout_del++;
                    man.getCollection().remove(key);
                }
            if (cout_del > 0) System.out.println(cout_del + " elements were deleted");
            else System.out.println("Nothing was changed. There are no elements bigger than given.");

            }
        }else System.out.println("Collection is empty");
    }
}
