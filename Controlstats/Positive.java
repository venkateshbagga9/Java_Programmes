//WAP to check whether a number is negative, positive or zero.
import java.util.*;
class Positive
{
   public static void main(String args[])
  {
    int x;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value");
    x=sc.nextInt();
    if(x>0)
    {
      System.out.println("x is a Positive number");
    }
    else if(x<0)
    {
      System.out.println("x is a Negative number");
    }
    else
    {
      System.out.println("x is a Nutral number");
    }
    
  }
}