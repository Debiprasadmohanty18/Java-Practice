import java.util.*;
public class Area_pentagon 
{
    public static void main(String [] abd)
    {
     System.out.println("Enter Perimeter & Apothem of Pentagon:-");
     Scanner ab = new Scanner(System.in);
     int p=ab.nextInt();
     int a=ab.nextInt();
     double A=0.5*p*a;
     ab.close();
     System.out.println("Area Of pentagon is:-"+A);
    }   
}
