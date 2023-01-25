import java.util.*;
class Reverse
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int x,first=0,last=0,digit=0,result=0;
      System.out.println("enter the x value");
      x=sc.nextInt();
      last=(x%10);
      while (x>0)
        {
          digit=x%10;
          result=result*10+digit;
          x=x/10;
          }
      System.out.println("the reverse number of x is "+result);
      
      
    }
  }