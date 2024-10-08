// Custom Exception helps us to give our own Exception Name.
// We can give our own exception name by taking the class name same as our exception name with the constructor by calling it's super class.


class WrongAgeException extends Exception
{
    public WrongAgeException(String s)
    {
        super(s);
    }
}


public class CustomThrow {
    public static void main(String[] args) {
        String name = "Amarendra Mohanty";
        int age = 18;
        try
        {
            System.out.println(name);
            System.out.println("Age:- " + age);
            if(age == 18)
            {
                age = 30;
                throw new WrongAgeException("Amar already married and You are saying Amar's age is only 18.");
            }
        }
        catch(WrongAgeException e)
        {
            System.out.println("Hey, I got an Error & that is :-  "+e   );
            System.out.println("Sorry Man,Let me Update Amar's age." );
        }
        catch(Exception e)
        {
            System.out.println("Hey, I got an Exception and that is :- "+e);
        }
        System.out.println("Updated Age of Amar is :- "+ age);
    }
}
