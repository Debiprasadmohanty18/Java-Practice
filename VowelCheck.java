// WAP to check the word having Vowel or Not.
// input :- Apple ---> True or Vowels are present 
// input :- xyz  ----> False or Vowels are not present

import java.util.Scanner;
public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Word:- ");
        String word = sc.next();
        String s = null;
        boolean result = false;
        sc.close();
        for(int i = 0;i<word.length();i++)
        {
            char k = word.charAt(i);
            if(k == 'a' | k == 'e' | k == 'i' | k == 'o' | k == 'u' | k == 'A' | k == 'E' | k == 'I' | k == 'O' | k == 'U' )
            {
                s = s+k;  
                result = true;
            }
        }
        if(result == true)
        {
            System.out.println("Vowels are present.");
        }
        else
        {
            System.out.println("Vowels are not Present.");
        }
    }
}
