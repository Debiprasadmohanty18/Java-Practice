import java.util.Scanner;
public class SumofArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n ;
        System.out.println("Enter Size of Array :- ");
        n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter Array Elments :- ");
        for(i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int sum = 0;
        for(i = 0 ; i < n ; i++) {
            sum = sum + arr[i];
            }
        System.out.println("Addition Of array Elements :- " + sum);
    }
}
