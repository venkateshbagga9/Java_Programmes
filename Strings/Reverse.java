import java.util.*;
class Reverse
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a string");
      String s=sc.nextLine();
      String str="";
      for(int i=s.length()-1;i>=0;i--)
        {
          str=str+s.charAt(i);
        }
      System.out.println("the reverse word is:"+str);
      if(s.equals(str))
      {
        System.out.println("the given string is a palindrome");
      }
      else
        System.out.println("not a palindrome");
    }
  }