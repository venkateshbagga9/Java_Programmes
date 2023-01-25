import java.util.*;
class Ifelse
  {
    public static void main(String args[])
    {
      int x;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the x value-");
      x=sc.nextInt();
      if(x%5==0&&x%11==0)
      {
        System.out.println("Print x is divisible");
      
      }
      else
      {
        System.out.println("print x is a not didvisible");
      }
      
      
    }
  }