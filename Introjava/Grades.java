import java.util.*;
class Grades
  {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int p;
     System.out.println("enter Percentage ");
    p=sc.nextInt();
    
      if (p<=100&&p>80)
      {
        System.out.println("Grade is A");
      }
      else if(p<=80&&p>70)
      {
        System.out.println("Grade is B ");
         }
    
        else if (p<=70&&p>60)
        {
          System.out.println("Grade is c ");
        }
      else
      {
        System.out.println(" you have Failed ");
      }
     }

      }
