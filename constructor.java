//A method Having same name as class name with no return type is called constructor.
// Constructor always "Void" type as it does not return any value
//It is used to instantiate object



//Default Constructor
class Fruits {
    
    Fruits( ) {    
        System.out.println("Mango");
    }
    
} 

//Parameterized constructor
class Animal {
    Animal(String k,String m)
    {
        System.out.print("Who is the King of Forest:- ");
        System.out.println(m);
        System.out.print("Who runs fast:- ");
        System.out.println(k);
    }
}



//Copy Constructor 
// A constructor that create an object using another object of the same java class
class A {
    A()
    {
        System.out.println("Nothing");
    }
    A(int a)
    {
        this();
        System.out.println("it is a Integer valued constructor");
    }
    A(double b)
    {
        this(2);
        System.out.println("it is a Integer valued constructor");
    }
}


public class constructor {
    public static void main(String[] args) {
        Fruits f = new Fruits();

        Animal obj = new Animal("Tiger", "Lion");

        A ob = new A(2.5);
    }

}
