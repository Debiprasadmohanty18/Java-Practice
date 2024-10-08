

public class Wrapper {
    public static void main(String[] args) {
        int x = 18;
        Integer k = new Integer(x);  //It is called Boxing because we manually converted the primituve type to object type
        System.out.println(k);

        Integer y = x;   // It is called autoboxing because it is automatically converted from primitive type to object type
        System.out.println(y); 

        int l = y.intValue();  // it is called unboxing because we converted it manually
        System.out.println(l);

        int z = y;       // It is called auto-unboxing because it is automatically converted from object type to primitive type
        System.out.println(z);


        String s  =  "18";
        int b = Integer.parseInt(s);
        System.out.println( b*3);
    }    
}
