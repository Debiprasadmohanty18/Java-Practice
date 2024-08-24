import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name ;
		System.out.print("Enter a name :- ");
		name = sc.nextLine();
		String reverseString = "";
		
		
		for(int i=0;i<name.length();i++)
		{	
			reverseString = name.charAt(i) + reverseString; 
		}
		
		System.out.println(reverseString);
	}

}
