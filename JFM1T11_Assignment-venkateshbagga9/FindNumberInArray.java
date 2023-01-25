/* JFM1T11_Assignment1:

   Write a program to find a number in an integer array. If found print the number and the array index at which it is found. 
   Prompt the user input from the terminal.
   
   Sample Input: 2,4,6,1,7,8,9
   Enter number to search x= 9

   Expected Output: 9 found at index 6
   
   Enter number to search x= 12
   Expected Output: Sorry! 12 is not found in array.
   
*/

import java.util.*;
public class FindNumberInArray 
{
  public static void main(String args[])
  {
    int position;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an Array");
    int n=sc.nextInt();
    ArrayList<Integer> al=new ArrayList();
    System.out.println("enter the Elements");
    for(int i=0;i<n;i++)
      {
        al.add(sc.nextInt());
      }
    System.out.println("Enter the Element to Search");
    int x=sc.nextInt();
    if(al.contains(x))
      { 
      position=al.indexOf(x);
      System.out.println(x+" is found at Index Position of "+position);
      }
    else
    System.out.println("Sorry! "+x+" is not found in Array");
  }
//main method

//declaring variables

//creating Scanner object

//take input from user

//find number in array

//search the element if found print that position else print not found message

}

//Good
