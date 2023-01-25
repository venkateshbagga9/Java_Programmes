import java.util.*;
class Multiplication
  {
    public static void multiplication()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      int a=sc.nextInt();
      System.out.println("enter b value");
      int b=sc.nextInt();
      int multiplication=a*b;
      System.out.println("the multiplication of two numbers is :"+multiplication);
    }
    public static void main(String args[])
    {
      System.out.println("execution starts form main method");
      multiplication();
      System.out.println("after calling the multiplication() this line going to be executed");
      multiplication();
    }
  }