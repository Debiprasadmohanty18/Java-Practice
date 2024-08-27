public class SwapWithoutArithmeticOperator {
    public static void main(String[] args) {
        int a=15;
        int b=28;
        System.out.println("Before Swapping The Value Of A = "+ a + " And Before Swapping The Value Of B = "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.print("After Swapping The Value Of A = "+ a + " And After Swapping The Value Of B = "+b);
    }
}
