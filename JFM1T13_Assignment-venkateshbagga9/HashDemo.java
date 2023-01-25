/*    JFM1T13_Assignment5:  

      Create an application having a Generic HashMap with Empcode  as key and EmpName as value. Display only EmpNames as output. 
       Prompt the user input from the terminal.

      Sample Input: 
      Enter Emp code:101
      Enter Emp Name: Ram
      Enter another student (y/n)?y
      Enter Emp code:102
      Enter Emp Name: Vaibhav
      Enter another student (y/n)?y
      Enter Emp code:103
      Enter Emp Name: Priyanka
      Enter another student (y/n)?n

      Expected Output: 
        Ram
        Vaibhav
        Priyanka
       
*/

import java.util.*;
public class HashDemo
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner(System.in);
      HashMap<Integer,String> hm=new HashMap<Integer,String>();
      do
        {
          System.out.println("enter Employee code");
          int id=sc.nextInt();
          System.out.println("enter Employee name");
          String name=sc.next();
          hm.put(id,name);
          System.out.println("Enter another Employee (y/n)? ");
          ch=sc.next().charAt(0);
        }
        while(ch=='y');
      for(Map.Entry m:hm.entrySet())
        {
          System.out.println(m.getValue());
        }
    }


//main method

//declare the HashMap 

//create a while loop for user not enter no

//ask for user input for value and key

//add the user inputs to the HashMap

//ask user if they want to enter another student details

//condition to satisfy in order to loop again

//use for each loop to grab Emp code and Emp Name

//print Emp Name

}