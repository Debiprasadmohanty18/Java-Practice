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
 
