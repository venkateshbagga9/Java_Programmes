//WAP to input week number and print week day.

import java.util.*;
class Week
  {
    public static void main(String args[])
    {
      int x;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the week number");
      x=sc.nextInt();
      if(x==1)
      {
        System.out.println("it is Monday");
      }
      else if(x==2)
      {
        System.out.println("it is Tuesday");
      }
      else if(x==3)
      {
        System.out.println("it is Wednesday");
      }
      else if(x==4)
      {
        System.out.println("it is Thursday");
  }
      else if(x==5)
      {
        System.out.println("it is Friday");
      }
      else if(x==6)
      {
        System.out.println("it is Saturday");
      }
      else
      {
        System.out.println("it is Sunday");
      }
      
    }
  }