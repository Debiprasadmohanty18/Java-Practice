import java.util.Scanner;
class TwoDArrayAddition 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.print("Enter How Many Rows Do You Want TO Take:- ");
        n = sc.nextInt();
        System.out.print("Enter How Many Columns Do You Want TO Take:- ");
        m = sc.nextInt();
        int [][] arr1 = new int[n][m];
        int [][] arr2 = new int[n][m];
        int [][] sum = new int[n][m];
        System.out.println("Enter 1st Array Elements:- ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("1st Array Elements Are:- ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr1[i][j]+ " ");
            }
            System.err.println();
        }
        System.out.println("Enter 2nd Array Elements:- ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("2nd Array Elements Are:- ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr2[i][j]+ " ");
            }
            System.err.println();
        }
        System.out.println("Sum Of Two Array:- ");
        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<m;j++)
            {
                sum[i][j] = sum[i][j] + arr1[i][j]+arr2[i][j];
                System.out.print(sum[i][j]+ " ");
            }
            System.err.println();
        }
    }
}