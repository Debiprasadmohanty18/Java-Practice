// Both are used to perform sorting operation.
//                  Comparable                    |                   Comparator                        |
// -> Comparable provides a single sorting        | -> The Comparator provides multiple sorting         | 
// sequence. In other words, we can sort the      |   sequence.In other words, we can sort the          |
// collection on the basis of a single element    |   collection on the basis of multiple elements      |
// such as id, name, and price.                   |   such as id, name, and price etc.                  |
// -> Comparable provides compareTo() method      | -> Comparator provides compare() method to          |
// to sort elements.                              |   sort elements.                                    |
// -> Comparable is present in java.lang package. | -> Comparator is present in the java.util package.  |
// -> We can sort the list elements of Comparable | -> We can sort the list elements of Comparator type |
//  type by Collections.sort(List) method.        |  by Collections.sort(List, Comparator) method.      |
//________________________________________________|_____________________________________________________|


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>
{

    String name;
    int salary;
    
    public Employee(String name, int salary) 
    {
        this.name = name;
        this.salary = salary;
    }
    
    public String toString() 
    {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }

    public int compareTo(Employee that) 
    {
        if(this.salary > that.salary)
                    return 1; 
                else
                    return -1;
    }
    
}


public class ComparableVsComparator {
    public static void main(String[] args) {

        Comparator<Employee> com = new Comparator<Employee>()    // As Comparator is a Functional Interface we can write all the below code using lambda expression.
       {
           public int compare(Employee info , Employee info2)
           {
                if(info.salary> info2.salary)
                    return 1;     // return 1; means Swap.
                else
                    return -1;     // return -1; means No-Swap.
           }
       };
    // Comparator<Integer> com = (info,info2) -> (info % 10 > info2 % 10) ? 1 : -1;

       List<Employee> data = new ArrayList<>();
       data.add(new Employee("Amar", 15000));
       data.add(new Employee("Nitu", 2000));
       data.add(new Employee("Anil", 2200));
       data.add(new Employee("Kalu", 01));
       data.add(new Employee("Murnal", 2500));

       Collections.sort(data);
       
       for(Employee e : data)
       {
        System.out.println(e);
       }



    }
    
}
 
