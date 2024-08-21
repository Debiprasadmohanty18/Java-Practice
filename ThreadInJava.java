// Thread is an instance of a process or it ia a light weight object of process.
// 

class A extends Thread {
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("Amar");
        }
    }
}
// class B extends Thread {
//     public void run()
//     {
//         for(int i=0;i<100;i++)
//         {
//             System.out.println("Amarendra");
//         }
//     }
// }

public class ThreadInJava {
    public static void main(String[] args) {
        A obj1 = new A();
        // B obj = new B();
        obj1.start();
        // obj.start();
    }
}
