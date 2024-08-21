class Counter {
    int count;
    public synchronized void  increment()
    {
        count ++;
    }
    // public void run()
    // {

    // }
}

public class SynchronizationInJava {
    public static void main(String[] args) {
        Counter c = new Counter();
        Runnable ob = () -> {
            for(int i = 0;i<5;i++)
            {
                c.increment();
            }
        };
        Runnable obj = () -> {
            for(int i = 0;i<5;i++)
            {
                c.increment();
            }
        };

        Thread t1 = new Thread(ob);
        Thread t2 = new Thread(obj);

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(c.count);
    }
}
