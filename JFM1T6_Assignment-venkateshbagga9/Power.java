/* JFM1T6_Assignment2:
   Write a method that takes 2 numbers as arguments/parameters and returns the value of num2 to the power of num1 back to the main method.
   Prompt the user for the base and power values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
    
   Expected Output:
   result = 9
   
*/
import java.util.*;
public class Power 
{
  static int power(int num1, int num2)
    {
        if (num2 == 0)
            return 1;
        else
            return num1 * power(num1, num2 - 1);
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the values:- ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
 
        System.out.println(power(num1, num2));
    }


//main method

//declare variables n,p,r and initialize r as one.

//create scanner class object

//take input from user

//check if (n>=0&&p==0) if true then it prints 1 else if check (n==0&&p>=1) if true then print zero else multiply r*n

//print result

}