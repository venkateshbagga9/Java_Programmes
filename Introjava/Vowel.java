//WAP to input any alphabet and check whether it is vowel or consonant.
import java.util.*;
class Vowel
{
   public static void main(String args[])
  {
    char x;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value");
    x=sc.next().charAt(0) ;
    if(((x=='A')||(x=='E')||(x=='I')||(x=='O')||(x=='U'))||((x=='a')||(x=='e')||(x=='i')||(x=='o')||(x=='u')))
    {
      System.out.println("x is a Vowel");
    
    }
    else
    {
      System.out.println("x is not a Vowel ");
    }
  }
}