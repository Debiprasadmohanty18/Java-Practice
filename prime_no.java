import java.util.*;
class prime_no
{
    public static void main(String [] args)
    {
        System.out.println("Enter Range:-");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,d=2,i;
        for(d=2;d<=n;d++)
        {
           count=0;  
            for(i=1;i<=d;i++)
            {
                if(d%i==0)
                {
                    count++;
                }
            }
            if(count==2)
        {
            System.out.println(d+" ");
        }
        }
        
    }
}