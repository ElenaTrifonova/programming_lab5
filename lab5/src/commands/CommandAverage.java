package commands;

import collection.Organization;
import lab.FileManager;
import java.util.concurrent.atomic.AtomicLong;

public class CommandAverage {
    public static void average(FileManager man){
        double  average = 0;

        /* AtomicLong sum = new AtomicLong();
        man.getCollection().forEach((k, v) -> sum.set(sum.get() + v.getEmployeesCount()));
        try {average = sum.doubleValue()/man.getCollection().size();
        }catch(NullPointerException e){
            System.out.println("Null action.");
        } **/

        long sum = 0;
        for (Organization org : man.getCollection().values()){
            sum = sum + org.getEmployeesCount();
        }
        average = sum/man.getCollection().size();

        System.out.println("Average of employees count is " + average);
    }

}
