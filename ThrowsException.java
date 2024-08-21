// throws is a keyword in Exception Handling which throw exception and tell to try and catch block to accept it.
class Dosomething
{
    public void show() throws NullPointerException
    {
        String s= null;     // Here we got exception and threw it
        System.out.println(s.length());
    }
}

public class ThrowsException {
    public static void main(String[] args) {
        Dosomething ob = new Dosomething();
        try {   // That exception is handled here
            ob.show();
        }
        catch(NullPointerException e)
        {
            System.out.println("Nothing Written... " +e);
        }
    }
}
