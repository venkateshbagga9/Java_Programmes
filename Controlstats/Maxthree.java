//WAP to find maximum among three numbers
import java.util.*;
class Maxthree
{
   public static void main(String args[])
  {
    int x,y,z;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the values");
    x=sc.nextInt();
    y=sc.nextInt();
    z=sc.nextInt();
    if(x>y&&x>z)
    {
      System.out.println("x is a big number");
    }
       else if(y>z)
        {
          System.out.println("y is a big number");
        }
            else
            {
              System.out.println("z is a big numer");
            }
          
        
      
    
  }
}