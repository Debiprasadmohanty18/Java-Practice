import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapFilter {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(3,8,5,9,1,2);

        // Stream<Integer> s = num.stream();
        // Stream<Integer> s1 = s.filter(n -> n%2==0);
        // Stream<Integer> s2 = s1.map(n -> n*2);
        // int s3 = s2.reduce(0,(c,e) -> c+e);/

// We can write all the above line in a singler line.
        Stream<Integer> k = num.stream().filter(n -> n%2==0).map(n -> n*2); // if it gives us a single value then we would save it on a variable.

        // System.out.println(s3);

        k.forEach(n -> System.out.println(n));
    }
}
