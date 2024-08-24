import java.util.Scanner;

public class SubString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String:- ");
		String s = sc.next();
		for (int i=0;i<s.length();i++) 
		{
			for (int j=i+1;j<=s.length();j++) 
			{
				String k = s.substring(i,j);
				System.out.println(k);
			}
		}
	}
}
