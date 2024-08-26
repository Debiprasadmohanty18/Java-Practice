import java.util.Scanner;
class ArrayAddition 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of array element do you want to take:- ");
        n = sc.nextInt();
        int [] arr1 = new int[n];
        int [] arr2 = new int[n];
        int [] sum = new int[n];
        System.out.println("Enter the 1st Array Element:- ");
        for(int i=0;i<n;i++) 
        {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Array Elements are:- ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the 2nd Array Element:- ");
        for(int j=0;j<n;j++) 
        {
            arr2[j] = sc.nextInt();
        }
        System.out.print("Array Elements are:- ");
        for(int j=0;j<n;j++)
        {
            System.out.print(arr2[j] + " ");
        }
        // for(int i=0;i<n;i++) 
        // {
        //     sum = sum + arr1[i];
        // }
        // System.out.print("Sum of Array Elements are:- "+ sum);
        System.out.println();
        System.out.print("Sum of two Array is:- ");
        for(int k = 0;k<n;k++)
        {
            sum[k] = arr1[k] + arr2[k];
            System.out.print(sum[k] + " ");
        }
    }
}
