import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:- ");
        int n = sc.nextInt();
        sc.close();
        int rem=0,sum=0;
        int temp = n;
        int count = 0;
        while(n!=0)
        {
            rem = n%10;
            n = n/10;
            count++;
        }
        n = temp;
        // System.out.println(count);
        while(n!=0)
        {
            rem = n%10;
            sum = sum + (int)Math.pow(rem,count);
            n = n/10;
        }

        if(temp == sum)
        {
            System.out.println(temp + " is an Armstrong Number.");
        }
        else
        {
            System.out.println(temp + " is not an Armstrong Number.");
        }
        
    }
}
