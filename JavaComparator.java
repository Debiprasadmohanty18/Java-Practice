// Comparator used to order the objects of user defined classes.
// A comparator object capable of comparing two objects of same class. 

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaComparator {
    public static void main(String[] args) {

        List<String> name = Arrays.asList("Amar","Tanmay","AnilKumar","Subham","Asish","RamakantaPal");
    // Arrays.asList() allows us to give the value directly.

        Comparator<String> com = (s,t) -> (s.length() > t.length()) ? 1 : -1;
                    
        Collections.sort(name,com);
        System.out.println(name);
    }
}
