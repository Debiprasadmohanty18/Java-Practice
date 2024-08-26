import java.util.Scanner;
public class Array_column_add 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);  
        int i,j,Sum=0;
        int m=5;
        int n=5;
        int arr[][]=new int[m][n];
        System.out.println("Enter Array Element = ");
        for(i=0;i<m;i++)
        { 
            for(j=0;j<n;j++)
            {
                 arr[i][j]=sc.nextInt();
            }
        }
        // System.out.println("Array Elements  Are = ");
        // for(i=0;i<m;i++)
        // { 
        //     for(j=0;j<n;j++)
        //     {
        //          System.out.print(arr[i][j]+" ");
        //          System.out.println();
        //     }
        // }
        for(i=0;i<5;i++)
        {
            for(j=0;j<5 && j%2==0;j++)
            {
                System.out.println("Sum of"+ j+1 +"index is="+ Sum);
                Sum=Sum+arr[i][j];
            }
            
        }
       
    }
}
