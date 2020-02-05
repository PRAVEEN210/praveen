import java.util.Scanner;

Main

public class Main {

    public static void main(String[] args) {
		
		Scanner Sc= new Scanner(System.in);
		
		System.out.println("Enter the number of items:");
		int n= Sc.nextInt();
		
        Sc.nextLine();
		System.out.println("Enter the item details in the format(Item Name$Item Type$Item Cost$Item Availability)");
		
		String[] s= new String[n];
		
        System.out.println("Items:");
		for(int i=0;i<n;i++)
		{
    
		s[i]=(String) Sc.nextLine();
		}
		
		for(int j=0;j<n;j++)
		{
		String[] a=s[j].split("\\$");
		Item it= new Item(a[0],a[1],Integer.parseInt(a[2]),Integer.parseInt(a[3]));
		
	    StringBuilder sb= new StringBuilder();
		
		sb.append(it);
		String x=null;
		if(Integer.parseInt(a[3])>0)
		{
		x=new String("Available");
		}
		else
		{
			x=new String("Not Available");
		}
		System.out.print(sb.append(x)+"\n");
		}
		

	}

}
==================

Item 

public class Item {

    private String name;
	private String type;
	private int cost;
	private int availableQuantity;
	
	public Item() {
		super();
	}

	public Item(String name, String type, int cost, int availableQuantity) {
		super();
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.availableQuantity = availableQuantity;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(int availableQuantity) {
		//if(availableQuantity>0)
		this.availableQuantity = availableQuantity;
	
}
	@Override
	public String toString() {
		return name+","+type+","+cost+",";
	}
	
	
	
	
}

