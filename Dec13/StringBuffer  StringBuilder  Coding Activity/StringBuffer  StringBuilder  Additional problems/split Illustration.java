import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
		
		Scanner Sc= new Scanner(System.in);
		
		System.out.println("Enter the string");
		String st= Sc.nextLine();
		
		StringTokenizer st1 = new StringTokenizer(st, " ");
		
		System.out.println("The words in the string are");
		while(st1.hasMoreElements())
		{
			System.out.println(st1.nextElement());
		}
		
	}

}
