import java .util.*;
public class Area_Parallelogram {
    public static void main(String [] abd)
    {
     System.out.println("Enter height & Breadth of Parallelogram:-");
     Scanner ab = new Scanner(System.in);
     int h=ab.nextInt();
     int b=ab.nextInt();
     float A=h*b;
     ab.close();
     System.out.println("Area Of Parallelogram is:-"+A);
    }
    
}
