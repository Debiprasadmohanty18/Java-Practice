class Employee {
    String name;
    int age;
    public void employeeInfo(String name) {
        // this.name = name;
        System.out.println(name);
    }
    public void employeeInfo(int age) {
        System.out.println(age);
    }
    public void employeeInfo(String name, int age) {
        System.out.println("Employee Name :- " + name + " " + 
         "Age :- " + age);
    }
}

class Labour extends Employee {
    public void employeeInfo(String name) {
        // this.name = name;
        System.out.println(name);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Labour e2 = new Labour();
        e2.employeeInfo("Amar");
        e1.name = "Anil Kumar Mohanty";
        e1.age = 29;
        e1.employeeInfo(e1.name , e1.age);
    }
    
}
