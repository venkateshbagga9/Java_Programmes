import java.util.*;
abstract class Math
  {
    abstract public int print();
  }
class Sum extends Math
  {
    public int print()
    {
      int x=9,y=18;
      int z=x+y;
      return z;
    }
  }
class Multiplication extends Math
  {
    public int print()
    {
      int p=7,q=14;
      int r=p*q;
      return r;
    }
  }
class Abstract
  {
    public static void main(String args[])
    {
      Sum obj1=new Sum();
      Multiplication obj2=new Multiplication();
      System.out.println("Sum of two numbers is: "+obj1.print());
      System.out.println("Multiplacation of two numbers is :"+obj2.print());
    }
  }