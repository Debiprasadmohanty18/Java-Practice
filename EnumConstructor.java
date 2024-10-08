enum Cricket{
    Bat(2400),Ball,Stumps(270),Gloves(500);

    
    private int price;

    private Cricket()  // It is the default constructor for Ball object.
    {
        price = 60;
    }
    private Cricket(int rupees)  //It is the parameterized constructor for Bat , Stumps , Gloves.(These Objects has their arguments)
    {
        price = rupees;
        System.out.println("Cricket has " + name());  // It will show Bat, Stumps and Gloves but not Ball because Ball is not parameterized constuctor.
    }
    public int getprice() // These are getters and setters to get the price 
    {
        return price;
    }
    public void setPrice(int mania)
    {
        price = mania;
    }

}

public class EnumConstructor {
    public static void main(String[] args) {
        // Cricket k = Cricket.Bat;
        // System.out.println(k + " : " + k.getprice());

        for(Cricket v : Cricket.values())  // Direct for loop
        {
            System.out.println(v + " : " + v.getprice());
        }
    }
}
