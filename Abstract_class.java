// Abstract keyword do not allow to create object so, we have to extend the parent class to create the object

//Abstract Class Without Abstract Method.
abstract class X {
    public void A() {
        System.out.println("It's an Abstract Class Without Abstract Method");   
    }
}
class Z extends X {

}


//Abstract Class With Abstract Method
abstract class S {
    abstract void AbstractMethod();
    public void H() {
        System.out.println("It's not in the Abstract method");   
    }

}
class K extends S {
    void AbstractMethod()
    {
        System.out.println("Yes, It is Abstract Method");
    }
}


//Abstract Class creating object without extending parent class(Using Anonymous Inner class)
abstract class Anonymous {
    abstract void WriteSomething();
}


public class Abstract_class {
    public static void main(String[] args) {
        Z ob = new Z();
        ob.A();

        K obj = new K();
        obj.AbstractMethod();
        obj.H();

        Anonymous obj1 = new Anonymous()         // Here we are not creating the object of abstract class, We are creating the object of Anonymous Inner class 
                                                 // creating the abstract part using Anonymous Inner Class
        {
            void WriteSomething()
            {
                System.out.println("In Anonymous Class");
            }
        };
        obj1.WriteSomething();
    }
}
