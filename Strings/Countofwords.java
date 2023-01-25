//the count 
import java.util.*;
class Countofwords
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String s;
      int count=0;
     System.out.println("enter the string");
      s=sc.nextLine();
      String s1[]=s.split(" ");
      for(int i=0;i<s1.length;i++)
        {
          count++;
        }
      System.out.println("the count of words in a given string is/are : "+count);
     
    }
  }