/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/
//import statements for java program to read inputs using Scanner class
import java.util.Scanner;
public class Operations 
{
public static void main(String args[])
  {
    int a=30,b=10,c=45,d=2,e=600,f=15,g=5,x,y;
    System.out.println("The difference between 30 and 10 is ="+(a-b));
        System.out.println("The Product of 45 and 2 is ="+(c*d));
        System.out.println("The division of 600 and 10 is ="+(e/b));
        System.out.println("Increment of the number 15 is ="+(f++));
        System.out.println("Decrement of the number 15 is ="+(++f));
        System.out.println("The Reminder of 14 and 5 is ="+(14%5));
  }

/*
  Use the scanner class to provide input at execution time using scanner object
  */
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the x value"+x);
  System.out.println("Enter the y value"+y);
    x=sc.nextInt();
    y=sc.nextInt();

/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/

//calculate difference,product,division,increment and remainder 
System.out.println("The Difference between"+x+"and"+y+"is ="+(x-y));
System.out.println("The Product of "+x+"and"+y+"is ="+(x*y));
System.out.println("The Division of "+x+"and"+y+"is ="+(x/y));
System.out.println("the Increment of "+x+"is ="+(x++));
System.out.println("the Decrement of "+x+"is ="+(++x));
System.out.println("The Reminder of "+x+"and"+y+"is ="+(x%y));


//print appropriate result for all operations
}
}