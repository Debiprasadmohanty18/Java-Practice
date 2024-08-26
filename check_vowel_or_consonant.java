import java.util.*;
class A
{
    void B()
    {
        System.out.println("Enter a Character To Check = ");
        Scanner b=new Scanner(System.in);
        char n = b.next().charAt(0);
        if(n==65 || n==69 || n==73 || n==79 || n==85 || n==97 || n==101 || n==105 || n==111 || n==117)
        {
            System.out.println(n+":-is Vowel");
        }
        else if(n>=65 && n<=91 || n>=97 && n<=122)
        {
            System.out.println(n+":-is Consonant");
        }
        else
        {
            System.out.println("It is not an Alphabet");
        }
        b.close();
    }

public class check_vowel_or_consonant
 {
    public static void main(String [] args)
    {
        A ob=new A();
        ob.B();
    }
}
}
