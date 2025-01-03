//Encapsulation is the process of wrapping or binding all the data into a single unit or class.

class Marriage 
{
    private int amarAge;
    private int nituAge;

    public int getAmarAge() // These are the getters() and setters() to access private data member
    {
        return amarAge;
    }
    public int getNituAge()
    {
        return nituAge;
    }
    public void setAmarAge(int age)
    {
        amarAge = age;
    }
    public void setNituAge(int age2)
    {
        nituAge = age2;
    }

}

public class Encapsulation
{
    public static void main(String[] args) {
        Marriage obj = new Marriage();

        obj.setAmarAge(31);
        obj.setNituAge(25);

        System.out.println(obj.getAmarAge());
        System.out.println(obj.getNituAge());


    }
}
