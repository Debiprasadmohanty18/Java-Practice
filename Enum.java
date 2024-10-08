//Enum is a class that represents group of constants.

enum Sports {
    Cricket,Football,Hockey,Kabadi,Volleyball;  // These are the constant or objects.
}

public class Enum {
    public static void main(String[] args) {
        Sports ob = Sports.Cricket;      // We can't create object of enum but we can create reference of enum.
        System.out.println(ob);

        Sports [] obb = Sports.values();  //values() helps to give you an array of enum class.

        for(Sports k : obb)  
        {
            System.out.println(k +" : "+k.ordinal());  // ordinal() gives the index number of the object present in enum.
        }


        // If Else

        if(ob == Sports.Cricket)
        {
            System.out.println("Let's Play Cricket...");
        }
        else if(ob == Sports.Football)
        {
            System.out.println("Let's Play Football...");
        }
        else if(ob == Sports.Hockey)
        {
            System.out.println("Let's Play Hockey...");
        }
        else if(ob == Sports.Kabadi)
        {
            System.out.println("Let's Play Kabadi...");
        }
        else
        {
            System.out.println("Let's Play Volleyball");
        }


        //Switch Case

        switch (ob) {
            case Cricket:
                System.out.println("Let's Play Cricket...");
                break;
            case Football:
                System.out.println("Let's Play Football...");
                break;
            case Hockey:
                System.out.println("Let's Play Hockey...");
                break;
            case Kabadi:
                System.out.println("Let's Play Kabadi...");
                break;
        
            default:
                System.out.println("Let's Play Volleyball...");
                break;
        }
    }
}