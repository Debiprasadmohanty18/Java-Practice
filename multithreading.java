 class method1 extends Thread 
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
        }
    }
}
     class method2 extends Thread 
{
    public void run()
    {
        for(int i=5;i<10;i++)
        {
            System.out.println(i);
        }
    }
}
class multithreading
{
    public static void main(String [] args)
    {
        method1 ob = new method1();
        method2 ob1=new method2();
        ob.start();
        ob1.start();
    }
}


