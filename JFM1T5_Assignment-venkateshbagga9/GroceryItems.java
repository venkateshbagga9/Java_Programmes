/* JFM1T5_Assignment 2:

   Write a program to store your 10 different expenses done in this month and print the highest price you incurred.
   Prompt the user for the 10 numbers to be input from the terminal.
   Sample Input:
   45.90
   23.56
   123
   23
   90.00
   344
   44
   60.01
   267
   100
   
   Expected Output:

   The highest price you incurred is 344.0

*/
import java.util.*;
public class GroceryItems 
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the No of Grocery Items :-");
    int n=sc.nextInt();
    int a[]=new int[n];
   System.out.println("enter the List of expenditures:- ");
    for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
   int highest=a[0];
    for(int i=0;i<n;i++)
    {
      if(a[i]>highest)
      {
        highest=a[i];
      }
    }
  System.out.println("The highest price among the Groceries is :-"+highest);
  }


  
  

//Define the main method

//Declare and initialize variables

//Take the 10 different expenses price

//Check the 10 different expenses price using for loop

//Calculate the highest price in all expenses and check if the expenses is more than new item. If true then return max.

//Print the result

}
