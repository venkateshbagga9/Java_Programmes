import java.util.*;
class Multiplication
  {
    public static void main(String args[])
    {
      int i=1,x;
      System.out.println("Enter the value");
      Scanner sc=new Scanner(System.in);
      x=sc.nextInt();
      while (i<=10)
      {
      System.out.println(x+"*"+i+"="+(i*x));
         i++;
      }
     
      
    }
  }
      
      