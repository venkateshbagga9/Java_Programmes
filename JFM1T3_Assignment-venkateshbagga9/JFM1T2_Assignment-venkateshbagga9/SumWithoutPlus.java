/*  JFM1T2_Assignment5:

    Write a program to print the sum of two numbers without using + operator.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    22
    Enter second number: 
    50
    
    Expected Output:
    The sum of two numbers is: 72
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;
class SumWithoutPlus 
{
  public static void main(String[] arg) 
	 {
	   int x, y;
    int a=22,b=50;
     	   System.out.print("enter a value: "+a);
     	   System.out.print("enter b value: "+b);
     while(b != 0){
            int total = a & b;
            a = a ^ b;
            b = total << 1;
     	  
     
	   Scanner sc = new Scanner(System.in);	
	   System.out.print("enter first number: ");
	   x = sc.nextInt(); 
	   System.out.print("enter second number: ");
	   y = sc.nextInt(); 
      while(y != 0){
            int sum = x & y;
            x = x ^ y;
            y = sum << 1;
        }
        System.out.println("Sum = "+x); 
		  }

  

//main method

/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/

//check if the second number is greater than zero then increase first number and decrease second number

//check if the second number is less than zero then decrease first number and increase second number

//print result

}