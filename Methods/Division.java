import java.util.*;
class Division
  {
    public static void div()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      int a=sc.nextInt();
      System.out.println("enter b value");
      int b=sc.nextInt();
      int division=a/b;
      System.out.println("the Diviison of two numbers is " +division);
    }
    public static void main(String args[])
    {
    div();
      }
  }