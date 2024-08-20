//Lambda Expression used to reduce the line of code.
// Lamda Expressions are like methods,but they do not have method name.

interface Animal {
    public abstract void eat(String food);
}
// class Cat implements Animal {
//     public void eat(String food)
//     {
//         System.out.println("Cat can eat ---> "+ food);
//     }
// }

interface Add {
    public abstract int sum(int a,int b);
}

public class LambdaExpression {
    public static void main(String[] args) 
    {

 // This is normal object creation.
        // Animal ob = new Cat();
        // ob.eat("Meat");

 // This is Anonymous Inner Class
        // Animal obj = new Animal() 
        // {
        //     public void eat(String food)
        //         {
        //             System.out.println("Cat can eat ---> "+ food);
        //         }
        // };
        // obj.eat("Fish");

 // using Lambda Expretion 
     Animal obj =  (String food) -> System.out.println("Cat can eat ---> "+ food);
        
     obj.eat("Fish"); 

     Add obj1 = (a,b) ->  a+b;
     System.out.println(obj1.sum(5,6));

    }
}
