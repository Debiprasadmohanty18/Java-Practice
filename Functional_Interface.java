// Functional Interface is the interface who has only one function.
@FunctionalInterface  //If we create a FunctionalInterface Annotation here that means we cann't create more than one function in an interface.
interface Animal {
    public abstract void eat();  // Interface methods are by default public and abstract so we can avoid writting that.
}

// class Cat implements Animal {
//     public void eat()
//     {
//         System.out.println("Animal Can Eat...");
//     }
// }

public class Functional_Interface {
    public static void main(String[] args) {
        // Cat ob = new Cat();
        // ob.eat();

        Animal obj = new Animal() 
        {
            public void eat()
                {
                    System.out.println("Animal Can Eat...");
                }
        };
        obj.eat();
    }
}
