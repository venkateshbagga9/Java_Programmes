/*  JFM1T2_Assignment7:

     Assume that the integer variable a is 20 and b is 10. Evaluate the following expressions and print the value of resultant variable:
     1. int b= a-- - --a;
     2. int c=a--;
     3. int d=a>>2;
     4. int e=a&b;
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter a value: 
     20
     Enter b value: 
     10
     
     Expected Output:
     a-- - --a is: 2
     a-- is: 18
     a>>2 is: 4
     a&b is: 0
*/

//import statements for java program to read inputs using Scanner class
import java.util.*;

public class Expression 
{
  public static void main(String args[])
  {
  int a=20,b=10;
  
     b= a-- - --a;
    int c=a--;
     int d=a>>2;
     int e=a&b;
    System.out.println("The expression of (a--)-(--a) is "+b);
   System.out.println("The expression of a-- is "+c);
   System.out.println("The expression of a>>2 is "+d);
   System.out.println("The expression of a&b is "+e);


    Scanner sc=new Scanner(System.in);
      System.out.println("Enter p value: ");
       int p=sc.nextInt();
      System.out.println("Enter q value: ");
       int q=sc.nextInt();
    q= p-- - --p;
    int r=p--;
     int s=p>>2;
     int t=p&q;
    System.out.println("The expression of (p--)-(--p) is "+q);
   System.out.println("The expression of p-- is "+r);
   System.out.println("The expression of p>>2 is "+s);
   System.out.println("The expression of p&q is "+t);
    





    
  }

//main method

/*Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*Take input from user
  System.out.println("Enter a value: ");
  int a=sc.nextInt();
*/

//print appropriate result for Expression operators

}