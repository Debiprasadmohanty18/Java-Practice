import java.util.*;
class B
    {
    void A()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number:-");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int Max=(a>b)?a:b;
        sc.close();
        System.out.println("Greatest Among Two Number is:-"+Max);
    }
    void C()
    {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter Three Number:-");
        int x=ab.nextInt();
        int y=ab.nextInt();
        int z=ab.nextInt();
        int Maximum=(x>y && x>z)?x:(y>z && y>x)?y:z;
        ab.close();
        System.out.println("Greatest Among Three Number is:-"+Maximum);
    }
}
 class greatest
    {
        public static void main(String [] args)
        {
            B ob=new B();
            ob.A();
        
            B ac=new B();
            ac.C();
        }
    }
