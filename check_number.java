import java.util.*;
class A
{
    void Tanmay()
    {
        System.out.println("Enter an Integer To Check = ");
        Scanner b=new Scanner(System.in);
        int n=b.nextInt();
        if(n>0)
        {
            System.out.println("Number Is Positive");  
        }
        else if(n<0)
        {
            System.out.println("Number Is Negetive");
        }
        else
        {
            System.out.println("It is Zero");
        }
        b.close();

    }
public class check_number 
{
    public static void main(String [] args)
    {
        A ob=new A();
        ob.Tanmay();
    }
}
}
