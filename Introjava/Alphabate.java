//WAP to check whether a character is alphabet or not.
import java.util.*;
class Alphabate
{
   public static void main(String args[])
  {
    char x;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value");
    x=sc.next().charAt(0) ;
    if(((x>='A')&&(x<='Z'))||((x>='a')&&(x<='z')))
    {
      System.out.println("x is a Alphabate");
    }
    else
    {
       System.out.println("x is not a Alphabate");
    }
  }
}