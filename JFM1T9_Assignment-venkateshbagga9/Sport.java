/* JFM1T9_Assignment5:
	Create an object named obj of the class Main and print the reference to the object using this keyword.
        
        Sample Output:
        Sport name: Football
*/ 
// Create a member variable for Sport name 

// Set member variable for Sport name 
import java.util.*;
class Sport
{ 
  String Game;
  Sport(String Game)
  {
    this.Game=Game;
  }
  Sport get()
  {
    return this;
  }
  void display()
  {
    System.out.println("Sport Name: "+Game);
  }
public static void main(String args[]) { 
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the Game Name : ");
  String Game=sc.nextLine();
  Sport x=new Sport(Game);
  x.get().display();

// Create object for Sport class 

// Print the value of Sport name using "this" reference

} 

} 