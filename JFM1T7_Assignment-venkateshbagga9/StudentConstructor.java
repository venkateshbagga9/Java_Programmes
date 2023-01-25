/* JFM1T7_Assignment1:

   Write a program to initialize data members of Student class using constructor.
   Prompt the user for the  values to be input from the terminal

   Sample Input:
   Enter student name: Shree Balaji
   Enter student Roll no: 01

   Expected Output:
   Name: Shree Balaji    Roll no: 01

*/
import java.util.*;
class FirstClass 
{
    String name;
    int roll;
  FirstClass(String name, int roll)
    {
        this.name = name;
        this.roll = roll;
    }
  public void display()
  {
   System.out.println("Name: "+name+"  Roll number: "+roll);
  }
}  
class StudentConstructor  
{
    public static void main(String[] args)
    {
    FirstClass obj1 = new FirstClass("Shree Balaji",01);
System.out.println("Name of the student: " +obj1.name);
      System.out.println("Roll Number of the Student: "+obj1.roll);
      obj1.display();
      }


//main method

//initialize Student class using constructor

//Get student name and rollno from user and set it to the Student object  

//print result



//Create Student class in that declare variables name and roll number 

//add  setter method for rollno
//public void setRollNo(int rollNum){ 
         //this.rollNo = rollNum; 


//add getter method for rollno
//public int getRollNo(){ 
      //return this.rollNo; 
} 

//add setters and getters for name fields also

//Good
