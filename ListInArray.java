// List is the sub interface of collection interface.
// it allow to add, remove,update and search the element.
// it also allow null values.


import java.util.ArrayList;
import java.util.List;

public class ListInArray {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();

        name.add("Ramakanta");
        name.add("Kumaresh");
        name.add("Asish");
        name.add("Sourav");
        name.add("Subham");
        name.add("Asish");   // List takes duplicate value.

        System.out.println(name); // to print like array we can directly print the object.

        System.out.println(name.get(2)); 

        for(String s : name)       // To print 1 by 1 we have to use for loop.
        {
            System.out.println(s);
        }
    }
}
