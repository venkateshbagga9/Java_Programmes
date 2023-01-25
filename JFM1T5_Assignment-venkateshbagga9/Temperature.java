/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/
import java.util.Scanner;
public class Practice1
{
  public static void main(String args[])
  {
    int Lowest,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no.of days :-");
    int n=sc.nextInt();
    int a[]=new int[n];
    Lowest=a[0];
    System.out.println("Enter the temperatures for "+n+" days ");
    for(i=0;i<n;i++)
      {
     a[i]=sc.nextInt();
        }
    Lowest=a[0];
    for(i=0;i<n;i++)
    {
      if(a[i]<Lowest)
      {
        Lowest=a[i];
      }
    }
  System.out.println("the Lowest temperature of the of the week is:- "+Lowest);
  }


//Define the main method

//Declare the variables and initialize

//Take temperature of 7 days as a input from user

//Calculate the lowest temperature

//Print the result

}