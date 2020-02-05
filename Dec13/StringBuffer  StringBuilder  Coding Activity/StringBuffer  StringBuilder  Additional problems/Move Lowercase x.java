import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
		
		Scanner Sc= new Scanner(System.in);
		
        System.out.println("Enter the string");
        String s= Sc.nextLine();
        int count=0;
        
        System.out.print("The processed string is ");
        char ac[] = s.toCharArray();
        for(int i = 0; i < ac.length; i++)
        {
           if(ac[i] == 'x')
           {
        	   count++;
        	   continue;
        	   
           }
           System.out.print(ac[i]);
        }
        while(count>0)
        {
        System.out.print('x');
        count--;
        }
	}}     
        
        
        
        
        
        
        
        
        
        
        
        
        
        