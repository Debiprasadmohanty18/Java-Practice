// We Can Call the parent class without using extends or implements keyword, by passing object refernce

class Cricket {
    public void play()
    {
        System.out.println("Play Cricket...");
    }
}

class Sports {
    public void whichSports(Cricket ob)
    {
        ob.play();
    }
}

public class PassingObject {
    public static void main(String[] args) {
        Cricket ob = new Cricket();

        Sports obj = new Sports();
        obj.whichSports(ob);

    }
}
