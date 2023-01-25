/* JFM1T13_Assignment2:

     Write a program to iterate through all elements in an ArrayDeque.Using iterator method
     Prompt the user input from the terminal.
     
     Sample Input: 12,31,6,23,90

     Expected Output:  
     ArrayDeque: [12, 31, 6, 23, 90]
     The iterator values are: 
     12
     31
     6
     23
     90
*/

import java.util.*;
public class IteratorArrayDeque 
{
public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);    
  ArrayDeque<Integer> deque=new ArrayDeque<Integer>();
      System.out.println("enter the size of an array");
      int n=sc.nextInt();
      System.out.println("enter the Elements of an array");
      for(int i=0;i<n;i++)
        {
          deque.add(sc.nextInt());
        }
System.out.println("ArrayDeque: " + deque);
      Iterator value = deque.iterator();
System.out.println("The iterator values are: ");
        while (value.hasNext()) 
        {
            System.out.println(value.next());
        }
    }

//create Scanner object

//create an empty ArrayDeque

//take input from user

//create an iterator

//Display the values after iterating through the Deque 

}