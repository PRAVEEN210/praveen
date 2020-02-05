import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		
		Scanner Sc= new Scanner(System.in);
		
		System.out.println("Enter the string");
		String st= Sc.nextLine();
		
		System.out.println("Enter the start string");
		String st2= Sc.nextLine();
		
		if(st.startsWith(st2))
    	{
			System.out.println("\""+st+"\" starts with \""+st2+"\"");
		}
		else
		{
			System.out.println("\""+st+"\" does not start with \""+st2+"\"");
		}

	}

}
