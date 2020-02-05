package org.animals ;

class Lion 
{
  String colour;
  float weight;
  int age;
  Lion(){}  
  Lion(String colour,float weight,int age)
  {
    this.colour=colour;this.weight=weight;this.age=age;
  }
  public boolean isVegetarian() 
 {
    return false;      
       
 }
  public boolean canClimb() 
 { 
   return false;

}
  public void getSound() 
  {
    System.out.println("Roars");
    
}

}

  
class Monkey {
 String colour;
  float weight;
  int age;
 Monkey(){}  
  Monkey(String colour,float weight,int age)
  {
    this.colour=colour;this.weight=weight;this.age=age;
  }

 public boolean isVegetarian() {
  return true;
}
  public boolean canClimb() {
   return true;
}
  public void getSound() {
   System.out.println("hooo");
   
}
  
}
  

class Elephant {
 String colour;
  float weight;
  int age; 
Elephant(){}  
   Elephant(String colour,float weight,int age)
  {
    this.colour=colour;this.weight=weight;this.age=age;
  }
 public boolean isVegetarian() {
  return true;
}
  public boolean canClimb() {
  return false;
}
  public void getSound() {
  System.out.println("bars");
}
  
}


