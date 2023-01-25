//WAP to check whether a number is divisible by 5 and 11 or not.
import java.util.*;
class Division
{
   public static void main(String args[])
  {
    int x;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value");
    x=sc.nextInt();
    if((x/5==0)&&(x/11==0))
    {
     System.out.println("X is divisible by both the 5 and 11");
    }
    else
    {
      System.out.println("X is Not divisible by both the 5 and 11");
    }

  }
}