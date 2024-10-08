// Set is also the sub interface of collection interface.
// it does not allow duplicate value.
// It uses TreeSet() to take value in the sorted form.

import java.util.HashSet;
import java.util.Set;

public class JavaSet {
    public static void main(String[] args) {
        Set<Integer> age = new HashSet<Integer>();   
        // Set<Integer> age = new TreeSet<Integer>();   // TreeSet() is used to take the value in sorted format.

        age.add(40);
        age.add(20);
        age.add(70);
        age.add(10);
        age.add(20);  // Set does not take duplicate value.

        for(int k : age)
        {
            System.out.println(k);
        }
    }
}
