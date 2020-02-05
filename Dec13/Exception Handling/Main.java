package Relationship;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws NumberFormatException, IOException
	{
	//create variable to store number of users
	int n=0;
	//create variable to store number of halls
	int numberOfHalls;
	//create input stream object
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	n=Integer.parseInt(br.readLine());
	//create an array of User type
	User uarray[]=new User[n];
	
	for(int i=0; i<n; i++)
	{
		User u=new User();
		System.out.println("User"+(i+1)+"\nName:");
		u.setName(br.readLine());
		System.out.println("contactNumber:");
		u.setContactNumber(br.readLine());
		uarray[i]=u;
	}
		System.out.println("Enter the number of halls");
		numberOfHalls=Integer.parseInt(br.readLine());
	
	for(int i=0;i<numberOfHalls;i++)
	{
		Hall h=new Hall();
		System.out.println("Hall"+(i+1)+"\nName:");
		h.setName(br.readLine());
		System.out.println("Cost per day:");
		h.setCostPerDay(Integer.parseInt(br.readLine()));
		System.out.println("Owner Name");
		h.setOwnerName(br.readLine());
		
		for(int x=0;x<uarray.length;x++ )
		{
			if(h.getName().equals(uarray[x].getName()))
			{
				uarray[x].addToHallList(h);	
			}
		}
		
	}
		
		for(User u : uarray)
		{
		System.out.println("Owner Name:");
		System.out.println("Hall ");
		System.out.println("Name:");
		System.out.println("Cost per day:");
		}
		
		
	}

}