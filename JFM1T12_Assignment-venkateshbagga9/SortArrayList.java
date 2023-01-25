/*  JFM1T12_Assignment2:

    Write a program to sort a given arraylist of integers in ascending order.   
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter how many numbers you want: 
    5
    Enter Number 0
    467
    Enter Number 1
    342
    Enter Number 2
    167
    Enter Number 3
    511
    Enter Number 4
    204
    
    Expected Output:
    ArrayList After Sorting:
    167
    204
    342
    467
    511

*/     

import java.util.*;  
public class SortArrayList  
{  
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of an Array");
    int n=sc.nextInt();
    ArrayList<Integer> al=new ArrayList();
    System.out.println("enter the Elements of an Array");
    for(int i=0;i<n;i++)
      {
        al.add(sc.nextInt());
      }
    System.out.println("The Array Elements before sorting: "+al);
    Collections.sort(al);
   System.out.println("The Array Elements After sorting: "+al);
  }

//main method

//declare variables

//create Scanner object

//take input from user

//create an object of ArrayList class

//sort ArrayList in ascending oeder

//print Array list

}