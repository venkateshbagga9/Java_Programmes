/*  JFM1T8_Assignment3:

    Write a program to find a substring in a string 
   without using an inbuilt method of String class.
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    Enter search string: bitLabs
    
    Expected output: bitLabs is found
    
    Enter search string: bitlab
    Expected output: bitlab is not found

*/

import java.util.*;
public class SubStringWithoutInbuilt
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the string :-");
		String str =sc.nextLine();
		System.out.println("enter the word to  find :-");
		String find =sc.nextLine();
		int i = str.indexOf(find);
		if(i>0)
		{
		  System.out.println(find+" is found");
		}
		else
			System.out.println(find+" is not found");
	}

//main method

//declare variables

//take input from user

//compare two strings if the search string found or not without using inbuilt method isSubString()

//creat isSubString method in that declare variable 

//check two strings if the search string is present then return true else return false

}