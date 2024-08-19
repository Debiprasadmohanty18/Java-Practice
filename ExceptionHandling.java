//                        Error                     |     Throwable  (Parent Class)
//                          |                       |         |
//              ____________|____________           |     Exception  (Throwable's Child)
//              |           |           |           |         |
//              |        Logical        |           |      RunTime   (Exception's Child)
//        Compile Time    Error      Run Time       |     Exception
//            Error                    Error        |         |
//                                                  |     Arithmatic (RunTime's Child)
// CompileTime Errors are Syntactical Error.        |      Exception
// Logical Errors are errors in logic of code.      |         &
// RunTime Errors are called Exception.             |   All Exception 



public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 5;
        int [] arr = new int[4];
        String s = null;
        try 
        {
            int j = a/5;  // If exception found in 1st line it will not execute remaining lines.
            System.out.println(j);
            System.out.println(arr[7]);
            System.out.println(s.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception is :- "+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception is :- "+e);
        }
        catch(NullPointerException e)
        {
            System.out.println("Exception is :- "+e);
        }
        catch(Exception e)                  // It is the parent of above exception so here it has written in the end block.
        {                                   // Parent Exception block always written at the end of every catch block.
            System.out.println("Exception is :- "+e);
        }
}
}
