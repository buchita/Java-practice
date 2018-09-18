package Lab2;
/*
    purpose: instantiate the animal objects
    Date:01/02/17
    Author:BG
 */
public class Control
{
  public static void main (String[] args)
  {
    Animal a1 = new Animal("Spot", "dog", 4, true, "Brown");
    System.out.println(a1);
    //change the name
    a1.setName("Sam");
    System.out.println(a1);
  }



}