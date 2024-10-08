// Collection is a framework or interface in java which is used to represent a group of idividual objects as single unit.
// Framework is a collection of classes and interfaces.
// Iterable interface is the root interface of collection classes.
// The Collection interface extends the iterable interface to access the subclasses.
// Iterable interface contain only one abstract class.


import java.util.ArrayList;
import java.util.Collection;

public class CollectionJava {
    public static void main(String[] args) {
        Collection<Integer> num = new ArrayList<Integer>();

        num.add(2);
        num.add(6);
        num.add(7);
        num.add(21);
        num.add(9);

    //Collection doesnot work on index value,but list works.

        for(int n : num)
        {
            System.out.println(n);  
        }
    }
}
