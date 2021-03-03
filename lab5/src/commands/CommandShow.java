package commands;

import collection.Organization;
import lab.FileManager;
//ПЕРЕДЕЛАТЬ ForEach
import java.util.Hashtable;

public class CommandShow{
    public static void show(FileManager man){
        if (man.getCollection().size() == 0){
            System.out.println("Collection is empty.");
        }
        else{
            System.out.println("Elements of collection:");
            man.getCollection().forEach ((k, v) ->{

                System.out.println("Key:" + k);
                System.out.println("Value:" + v.toString());
            });
        }
    }
}
