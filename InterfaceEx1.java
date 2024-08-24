interface A {
    public void show();
}
interface B {
    public void display();
}
interface C {
    public void doSomething();
}
interface D {
    public void trySomething();
}

class E implements A,B,C,D {
    public void show()
    {
        System.out.println("In A");
    }
    public void display() 
    {
        System.out.println("In B");
    }
    public void doSomething()
    {
        System.out.println("In C");
    }
    public void trySomething()
    {
        System.out.println("In D");
    }

}

public class InterfaceEx1 {
    public static void main(String[] args) {
        E ob = new E();
        ob.show();
        ob.display();
        ob.doSomething();
        ob.trySomething();
    }
}