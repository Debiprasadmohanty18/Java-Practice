import java.util.Scanner;

public class RowAddition {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.print("Enter The Number Of Row:- ");
        n = sc.nextInt();
        System.out.print("Enter The Number Of Column:- ");
        m = sc.nextInt();
        int [][] arr1 = new int[n][m];
        int sum = 0;
        System.out.println("Enter Array Elements:- ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array Elements Are:- ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                sum = sum + arr1[i][j];
            }
            System.out.println("Addition Of "+i+" Row:- " + sum);
            sum = 0;
        }
    }
}
