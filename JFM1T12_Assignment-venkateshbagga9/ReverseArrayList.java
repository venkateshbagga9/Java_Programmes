/*  JFM1T12_Assignmwnt4:

    Write a Java program to reverse elements in an arraylist.
    Prompt the user input from the terminal.
     
    Sample Input:
    Enter how many numbers you want: 
    5
    Enter Number 0
    995
    Enter Number 1
    367
    Enter Number 2
    511
    Enter Number 3
    789
    Enter Number 4
    111
    
    Expected Output:
    Elements after reversing:111 789 511 367 995  

 */

import java.util.*; 
import java.util.ArrayList; 
class ReverseArrayList 
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of an Array");
      int n=sc.nextInt();
      ArrayList<Integer> al=new ArrayList<Integer>();
      System.out.println("Enter the Elements");
      for(int i=0;i<n;i++)
        {
          al.add(sc.nextInt());
        }
      System.out.println("before Reverse");
      System.out.println(al);
      Collections.reverse(al);
      System.out.println("after Reverse");
      System.out.println(al);
      
    }
  


//Take an arraylist as a parameter and returns a reversed arraylist 

//Arraylist for storing reversed elements

//Append the elements in reverse order 

//Return the reversed arraylist

//Iterate through all the elements and print

//main method

//creat an object of ReverseArrayList class 

//take input from user

//creat an object of ArrayList class

//call reverseArrayList method

//call printElement method

}