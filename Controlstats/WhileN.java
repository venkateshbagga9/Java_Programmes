import java.util.*;
class WhileN
  {
    public static void main(String args[])
    {
      int i=1,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value");
      n=sc.nextInt();
      while(i<=n)
        {
          if(i%2==0)
           
          {     
          System.out.print(i+" ");
          }
          i++;
        }
      
    }
  }