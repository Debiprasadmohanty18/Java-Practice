import java.util.Scanner;
import java.util.Random;

class NumberGuess {
   
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String start = "YES";
        while (start.equals("YES"))
         {
            Random obj = new Random();
            int randomNumber = obj.nextInt(100);
            int guessedNumber = 0;
            int tries = 0;
            while(guessedNumber != randomNumber)
            {
                System.out.println("Enter a Number Between 1 to 100 : ");
                guessedNumber = sc.nextInt();
                tries++;
                if (guessedNumber == randomNumber)
                {
                    System.out.println("Yeaah! You Guessed The Right Number");
                    System.out.println("You took " + tries + " chances to guess the Number.");
                    System.out.print("Do You Want to Play Again ? Yes or No : ");
                    start = sc.next().toUpperCase();
                }
                else if(guessedNumber > randomNumber)
                {
                    System.out.println("Your Guessed Number is too High");
                }
                else
                {
                    System.out.println("Your Guessed Number is too Low");
                }
                
            }     
        }
        sc.close();
       
    }
}