// WAP to Print Fibonacci Series :- 0 1 1 2 3 5 8 13...

public class FibonacciNumber {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        System.out.print(i + "  " + j+ " ");
        int n = 0;
        while(n<5)
        {
            int k = i + j;
            i = j;
            j = k;

            System.out.print(" " + k + " ");


            n++;
        }
    }
}
