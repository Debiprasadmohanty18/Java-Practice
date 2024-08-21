import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n,rem,sum=0;
        System.out.print("Enter A Number:- ");
        n=sc.nextInt();
        while (n>0)
        {
            rem=n%10;
            sum = sum * 10 + rem;
            n = n/10;   
        }
        System.out.println();
        System.out.print("Reverse Of That Number Is:- "+ sum);
    }
}
