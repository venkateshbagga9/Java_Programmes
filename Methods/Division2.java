import java.util.*;
class Division2
  
  {
  public static void div(double a,double b)
    {
    double division=a/b;
      System.out.println("the multiplication of two numbers is "+division);
    }
   public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the x value");
      int x=sc.nextInt();
      System.out.println("enter the y value");
      int y=sc.nextInt();
      
      div(x,y);
      }  
    
  }