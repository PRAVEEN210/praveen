package org.animals ;

class Animaldemo
{
  public static void main(String args[])
   {
     Lion l=new Lion("Wheatish",25.25f,11);
     Monkey m=new Monkey("Black",7.5f,12);
     Elephant e=new Elephant("Ivory",250.00f,20);

       System.out.println(l.colour+" Lion weight is "+l.weight+" and it has "+l.age+" years of age");
       System.out.println(m.colour+" Monkey weight is "+m.weight+" and it has "+m.age+" years of age");
       System.out.println(e.colour+" Elephant weight is "+e.weight+" and it has "+e.age+" years of age");
}
}
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


