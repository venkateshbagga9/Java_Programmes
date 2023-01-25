/*  JFM1T2_Assignment6:

    Write a program that swaps the values of 2 variables without using third variable.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    12
    Enter second number: 
    45
    
    Expected Output:
    Before swapping: 12 , 45
    After swapping: 45 , 12
*/
import java.util.*;
class Swapping
  {
    public static void main(String args[])
    {
      int a=12,b=45;
      System.out.println("before swapping a= "+a+" and b = "+b);
      a=a+b; 
      b=a-b;  
      a=a-b;  
      System.out.println("After swapping a ="+a+" and b = "+b);

      Scanner sc=new Scanner(System.in);
      int x,y;
      System.out.println("enter the x value");
      x=sc.nextInt();
      System.out.println("enter the y value");
      y=sc.nextInt();
      System.out.println("before swapping x= "+x+" and y = "+y);
      x=x+y; 
      y=x-y;  
      x=x-y;
    System.out.println("After swapping x= "+x+" and y = "+y);

      
      
      
    }
  }

//import statements for java program to read inputs using Scanner class

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

//swapping two numbers without using third variable

//print result

