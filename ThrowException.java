// throw is a keyword used to declare an exception.
// It helps to programmer by telling that "an exception might occur here".


public class ThrowException {
    public static void main(String[] args) {
        String s = null;
        try 
        {
            System.out.println(s);
            if (s == null)
            {
                throw new NullPointerException("Your String having no value");
            }
        }
        catch(NullPointerException n)
        {
            System.out.println("Got Exception :- "+ n);
        }
        catch(Exception k)
        {
            System.out.println("Exception is :- "+ k);
        }
    }
}
