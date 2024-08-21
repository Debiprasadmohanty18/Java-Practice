import java.util.Scanner;
public class ReverseString {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        char ch;
        String reverse = "";
        System.out.print("Enter A Word:- ");
        s = sc.nextLine();
        System.out.println();
        for(int i = 0;i< s.length();i++)
        {
            ch = s.charAt(i);
            reverse = ch+reverse;
        }
        System.out.print("Reverse Of This String is:- "+reverse);
    }
}
