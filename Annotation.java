// Annotation are used to provide some Information about program and it does not affect the action of  compiled program.

class Animal {
    public void eatSomeFoodThenPlay()
    {
        System.out.println("Have some food..");
    }
}
class Cat extends Animal {
    @Override                   // If I add an Annotation here It will show what is the wrongly typped method name in child class
    public void eatSomeFoodThenPlay()
    {
        System.out.println("Now You Can Play..");
    }
}
public class Annotation {
    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.eatSomeFoodThenPlay();
    }
}