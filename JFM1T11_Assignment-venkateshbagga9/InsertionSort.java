/* JFM1T11_Assignment3:

   Have you ever arranged the deck of cards, or maybe shirts in your cupboard? What is common between those two things? 
   Well, you put the next card or shirt into their proper position, or we can say you insert the next element in its 
   proper position. Write a program to sort an unsorted array of numbers in the same manner.
   Prompt the user input from the terminal.

   SampleInput: 6,5,4,3,2,1
   
   Expected Output: 1,2,3,4,5,6

*/

import java.util.*;
public class InsertionSort 
{
  public static void main(String[] args) 
  {  
    Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size of an array");
    int n=sc.nextInt();
    int[] arrayN=new int[n];
    System.out.println("Enter the Elements in an Array");
    for(int k=0;k<n;k++)
      {
        arrayN[k]=sc.nextInt();
      }
  System.out.println("Original Array:"+ Arrays.toString(arrayN));
    for(int i=1;i<n;++i)   
    {  
        int temp=arrayN[i];  
        int j=i-1;  
        while(j>=0&&arrayN[j]>temp)   
        {  
            arrayN[j+1]=arrayN[j];   
            j=j-1;  
        }  
        arrayN[j+1]=temp;  
    }
    System.out.println("Sorted Array:"+ Arrays.toString(arrayN));
}  

//main method

//take input from user

//create integer array for all elements

//call sort method

//print sorted array

//create sort method

//declare variables

// storing current element whose left side is checked for its correct position 

//check whether the adjacent element in left side is greater or less than the current element.

// move the left side element to one position forward.

 // move current element to its  correct position.

}

//Good
