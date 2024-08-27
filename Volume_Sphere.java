import java.util.*;
public class Volume_Sphere
{
    public static void main(String [] abd)
    {
     System.out.println("Enter Radius:-");
     Scanner ab = new Scanner(System.in);
     int r=ab.nextInt();
     double A=1.3*3.14*r*r*r;
     ab.close();
     System.out.println("Area Of Rectangle is:-"+A);
    }
}