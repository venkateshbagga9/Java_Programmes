import java.util.*;
class Whileeven
  {
    public static void main(String args[])
    {
      int i=1,n;int sum=0;
      System.out.println("Enter the values");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      while (i<=n)
      {
        if (i%2==0)
        {
          System.out.println(+i);
          sum=sum+1;
        }
        i++;
      }
      System.out.println("the sum of N even number");
          
    }
  }

