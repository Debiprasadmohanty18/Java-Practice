import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(4,1,6,9,2,5);


        num.forEach(n->System.out.println(n)); //foreach()has a Consumer argument which is a funtion interface having accept(object o);

        // Consumer<Integer> con = new Consumer<Integer>() {
        //     public void accept(Integer n)
        //     {
        //         System.out.println(n);    // Instead Of writing these all we can write the above single statement.
        //     }
        // };
        // num.forEach(con);


        // for(int i=0;i<num.size();i++)
        // {
        //     System.out.println(num.get(i));
        // }

        // for(int k : num)
        // {
        //     System.out.println(k);
        // }
    }
}
