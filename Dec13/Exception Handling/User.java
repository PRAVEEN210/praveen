package Relationship;

import java.util.ArrayList;
import java.util.List;

public class User {
private String name;
private String contactNumber;
private List<Hall> hallList;
public User() {
	super();
	//create ArrayList collection
	hallList=new ArrayList<Hall>();
}
public User(String name, String contactNumber) {
	super();
	this.name = name;
	this.contactNumber = contactNumber;
	
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getContactNumber() {
	return contactNumber;
}
public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}

public List<Hall> getHallList() {
	return hallList;
}
public void setHallList(List<Hall> hallList) {
	this.hallList = hallList;
}
public void addToHallList(Hall hall)
{
	//add the parameter hall to the collection hallList
	hallList.add(hall);
	
	
}

}
