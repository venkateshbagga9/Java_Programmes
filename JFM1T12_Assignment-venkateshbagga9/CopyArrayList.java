/*   JFM1T12_Assignment3:

     Write a program to copy one arraylist into another.
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter how many numbers you want: 
     5
     Enter Number 0
     5
     Enter Number 1
     4
     Enter Number 2
     3
     Enter Number 3
     2
     Enter Number 4
    
    Expected Output:
    -----Iterating over the second ArrayList----
     5
     4
     3
     2
     1

*/

import java.util.*; 
import java.util.ArrayList; 
class CopyArrayList  
{ 
public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size");
    int n=sc.nextInt();
    ArrayList<Integer> al1=new ArrayList<Integer>();
    System.out.println("enter the elements of an Array");
    for(int i=0;i<n;i++)
      {
        al1.add(sc.nextInt());
      }
    System.out.println("The 1st Array List: "+al1);
  ArrayList<Integer> al2=new ArrayList<Integer>(al1.size());
      al2.addAll(al1);
    System.out.println("After copy of Array: "+al2);
  }
//main method

//declare variables

//create Scanner object

//take input from user

// Assign the first reference to second

// Iterat over second ArrayList and print

}