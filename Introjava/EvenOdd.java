//WAP to check whether a number is even or odd
import java.util.*;
class EvenOdd
{
   public static void main(String args[])
  {
    int x;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value");
    x=sc.nextInt();
    if(x%2==0)
    {
      System.out.println("x is a Even Number");
    }
    else
    {
      System.out.println("x is a odd number");
    }
      
  }
}