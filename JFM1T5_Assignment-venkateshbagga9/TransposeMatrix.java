/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.*;
public class TransposeMatrix 
{
  public static void main(String []args)
     {
       Scanner sc=new Scanner(System.in);
         int x,y;      
    System.out.println("Enter the number of rows:- \n");
    x=sc.nextInt(); 
  System.out.println("Enter the number of columns:- \n");
         y=sc.nextInt();  
         int a[][]=new int[10][10];       
    System.out.println("Enter the elements of the matrix:- ");
         for(int i=0;i<x;i++)
         {
            for(int j=0;j<y;j++)
            {
                 a[i][j]=sc.nextInt();
            }
         }
    System.out.println("The elements in the original matrix are:- ");
         for(int i=0;i<x;i++)     
         {
             for(int j=0;j<y;j++)
             {
                  System.out.print(a[i][j]+" ");
             }
            System.out.println("");
        }
        System.out.println("After transposing the elements are :-");
        for(int i=0;i<x;i++)      
        {
             for(int j=0;j<y;j++)
             {
                 System.out.print(a[j][i]+" ");
             }
            System.out.println("");
        }
         
     }


//Define the main method

//Declare the variables

//Take input from user to enter rows and column values

//Convert the square matrix into transpose

//Print the transpose matrix

//printing j and i instead of i and j

}