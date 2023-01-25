/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/

//import statements for java program to read inputs using Scanner class 
import java.util.*;
public class HighestNumber 
  {
   public static void main(String args[])
  {
    int first,second,third;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    first=sc.nextInt();
    System.out.println("Enter the second number");
    second=sc.nextInt();
    System.out.println("Enter the third number");
    third=sc.nextInt();
    if(first>second&&first>third)
    {
      System.out.println(+first+"  is a big number");
    }
       else if(second>third)
        {
          System.out.println(+second+"  is a big number");
        }
            else
            {
              System.out.println(+third+"  is a big number");
            }
     
//Add main method

//Declare the three variables

//Use the scanner class to provide input at execution time
/* 
 Scanner s= new Scanner(System.in);
 System.out.println("Enter the first number");
 number1=s.nextInt();
 
*/

//check which number is highest using if else condition

//Print the highest of three numbers
 
}
  }