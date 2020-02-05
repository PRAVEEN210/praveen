import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the string");
		String st= sc.nextLine();
		
		StringTokenizer st1= new StringTokenizer(st," ");
		StringBuffer sb= new StringBuffer();
		
		while(st1.hasMoreElements())
		{
			sb.append(st1.nextElement()).append(" ");
		} 
		
		st= sb.toString();
		System.out.println("The processed string is "+st);
		
		

	}

}
