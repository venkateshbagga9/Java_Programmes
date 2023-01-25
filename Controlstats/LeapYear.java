//WAP to check whether a year is leap year or not.
import java.util.*;
class LeapYear
{
   public static void main(String args[])
  {
    int year;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the values");
    year=sc.nextInt();
    if((year%4==0 && year%100!=0)||(year%400==0))
  {
  System.out.println("This is a leap year");
        }
      else
      {
        System.out.println("This is Not a leap year");
      }
      
    }
  }


    
  
