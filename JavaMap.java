// Map interface is not a subtype of Collection interface.
// It does not depend on index. 
// It takes the value as a (key : value) pair.

import java.util.HashMap;
// import java.util.Hashtable;
import java.util.Map;

public class JavaMap {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();
        // Map<String,Integer> students = new Hashtable<>();  // We can use Hashtable also,but we basically use Hashtable() where we need synchronization.

        students.put("Debiprasad",73);
        students.put("Ramakanta",81);
        students.put("Amarendra",97);
        students.put("Kumarsh",43);
        students.put("Debiprasad",65);

        // It does not take duplicate value, first It checks the key is available or not if the key is there then it just update the value to latest value. and if the key is not there then it adds the whole key value pair.
        // It uses put(key,value) to take value.

        System.out.println(students);

        System.out.println(students.get("Ramakanta"));  // get(object or key) gives us the value of that object or key.


        for(String i : students.keySet())
        {
            System.out.println(i + " : " + students.get(i));
        }
    }
}
