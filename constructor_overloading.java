public class constructor_overloading 
{
    int roll_no;
    String name;
    constructor_overloading()
    {
        System.out.println("Subham nayak");
    }
    constructor_overloading(int i,String n)
    {
        roll_no=i;
        name=n;
        System.out.println("The name Of The Student is "+name+ " Having Roll No.= "+roll_no);
    }
    public static void main(String [] args)
    {
        constructor_overloading ob=new constructor_overloading();

        constructor_overloading ob1=new constructor_overloading(45,"Tanmay");
    }
}
