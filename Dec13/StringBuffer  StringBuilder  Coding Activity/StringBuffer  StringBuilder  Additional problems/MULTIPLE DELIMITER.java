import java.util.Scanner;

public class Main {

    public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);  // Setting a Scanner
		
		System.out.println("Enter detail (start time1|end time1,start time2|end time2)");
		String s= sc.next();                        // Reading a String
		
		String a[]= s.split(",");                   //Splitting based on ','
		
		System.out.println("Call Details");
		System.out.println("Number of calls made : "+a.length);
		
	    for(int i=0;i<a.length;i++) 
	    {
	    	String b[]= a[i].split("\\|");             //Splitting based on '|'
	    	System.out.println("Call "+(i+1)+" :");
	    	for(int j=0;j<b.length;j++)                    //printing call log
	    	{
	    		if(j%2==0)
	    		{
	    			System.out.println("Start Time : "+b[j]);
	    		}
	    		else
	    		{
	    			System.out.println("End Time : "+b[j]);
	    		}
	    	}
	    }
	}
}
