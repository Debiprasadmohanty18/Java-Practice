// import java.util.*;
class A
{
    int method(int a,int b)
    {
        return a+b;
    }
    int method(int a,int b,int c)
    {
        return a*b*c;
    }
}
public class method_overloading
{
    public static void main(String [] args)
    {
        A ob=new A();

        System.out.println(ob.method(10,20));
        System.out.println(ob.method(5,6,0));
    }
}