/*  JFM1T8_Assignment4:

    Write a program to check whether a string is a Palindrome.
    Prompt the user input from the terminal.
    
    Sample input: Malayalam
    
    Expected output: Malayalam is a Palindrome
*/

import java.util.Scanner;
public class Palindrome
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a string :-");
      String s=sc.nextLine();
      String str="";
      for(int i=s.length()-1;i>=0;i--)
        {
          str=str+s.charAt(i);
        }
      System.out.println("The reverse word is:- "+str);
      if(s.equals(str))
      {
        System.out.println(s+" is a palindrome");
      }
      else
        System.out.println(s+" is not a palindrome");
    }


//main method

//declare varible

//take input from user

/* 
   divide the whole string into two halves and compare each character in the 
   first half with each character in the second half in reverse.  
   If both are equal then it is a palindrome else print it is not a palindrome 
*/

}