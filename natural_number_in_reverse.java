import java.util.Scanner;
public class natural_number_in_reverse
{
    public static void main(String [] args)
    {
    int n;
    System.out.println("Enter Range = ");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    sc.close();
    int i=1;
    while(n>=1)
    {
        System.out.println(n);
        n--;
    }
    }
}

