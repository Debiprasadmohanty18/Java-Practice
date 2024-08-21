import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
    String s = "Mom";
    String t = "Omn";
    
    s = s.toLowerCase();
    t = t.toLowerCase();
    if(s.length() == t.length()) {
      char[] charArray1 = s.toCharArray();
      char[] charArray2 = t.toCharArray();
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println("True");
      }
      else {
        System.out.println("False");
      }
    }
    else {
      System.out.println("False");
    }
  }
}
