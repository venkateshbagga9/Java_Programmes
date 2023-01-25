//with return type with Arguments
import java.util.*;
class Subtraction2
  {
    public static double sub(double a,double b)
    {
      double c=a/b;
      return c;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter x value");
      double x=sc.nextFloat();
      System.out.println("enter y value");
      double y=sc.nextFloat();
      double result=sub(x,y);
      System.out.println("the subtraction of two numbers is :"+result);
    }
    }
