import java.util.*;
class Vehicle {
    String brandName = "BMW G10R";
    String type = "Bike";
    }
    
class Car extends Vehicle {

    public void msg () {
        System.out.println("Hii");
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.brandName + " is a " + c1.type);
        c1.msg();
    }
}
