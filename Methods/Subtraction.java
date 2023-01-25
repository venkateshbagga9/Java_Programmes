//With return type no arguments
import java.util.*;
class Subtraction
  {
   public static double sub()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      double a=sc.nextFloat();
      System.out.println("enter b value");
      double b=sc.nextFloat();
      double c=a/b;
      return c;
    }
    public static void main(String args[])
    {
     
      double result=sub();
  System.out.println("the subtraction of two numbers is :"+result);
    }
    }
