/*   JFM1T12_Assignment5:

     Write a program to build any collection containing duplicates. Create its copy with all duplicates removed. 
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter how many numbers you want: 
     4
     Enter Number 0
     4
     Enter Number 1
     3
     Enter Number 2
      3
     Enter Number 3
     4
     
     Expected Output:
     After removing duplicates: [4, 3]
*/     

import java.util.*; 
import java.util.ArrayList; 
class Duplicate  
{ 
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an Array");
      int n=sc.nextInt();
      TreeSet<Integer> ts=new TreeSet<Integer>();
      System.out.println("enter the elements of an Array");
      for(int i=0;i<n;i++)
        {
          ts.add(sc.nextInt());
        }
      System.out.println("After removing the Duplicate values Array is: "+ts);
    }

//main method

//create Scanner object 

//take input from user

//creat an object of LinkedHashSet class 

//creat an object of ArrayList class and pass LinkedHashSet object

//Print result

}