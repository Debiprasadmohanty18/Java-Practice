// Comparableused to order the objects of user defined classes.
// In this you can sort the elements on the basis of single data member only.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{

    String name;
    int age;
    public Student(String string, int i) 
    {
        name = string;
        age = i;
    }
    public int compareTo(Student s)
    {
    
    // Sort According to age.
        // if(this.age > s.age)
        //     return 1;
        // else
        // return -1;
    
    // Sort according to length of name.
        if(this.name.length() > s.name.length())
            return 1;
        else
        return -1;
    }

    public String toString() {
        return name + " : " + age;
    }
    

}

public class JavaComparable {
    public static void main(String[] args) {
        
        List<Student> info = new ArrayList<Student>();

        info.add(new Student("Kumaresh",45));
        info.add(new Student("Ramesh",17));
        info.add(new Student("Rajesh",07));
        info.add(new Student("Sipun",42));
        info.add(new Student("Badal",18));

        
        Collections.sort(info);
        
        for(Student k : info)
            System.out.println(k);
    }
}
