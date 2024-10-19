import java.util.*;
import java.lang.*;
public class Java_Static_Initializer_Block {
    static int H,B;
    static boolean flag;
    static
    {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        B = sc.nextInt();
        flag = true;
        sc.close();
        try
        {
            if(H<=0 || B<=0)
            {
                throw new Exception("Height & Breadth Must Be Positive");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.exit(0);
        }

    }
    public static void main(String[] args) {
        
        if(flag)
        {
            int area = B * H;
            System.out.println(area);
        }
        
    }
}