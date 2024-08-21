class A{
    public void run()
    {
        for(int i = 0;i<50;i++)
        {
            System.out.println("Hii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B {
    public void run()
    {
        for(int i = 0;i<50;i++)
        {
            System.out.println("Debiprasad");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadPriority {
    public static void main (String [] args) {
        A ob = new A();
        B obj = new B();
        ob.run();
        obj.run();
    }
}
