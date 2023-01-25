import java.util.*;
class Forloop
  {
    public static void main(String args[])
    {
      int i,n;
      int count=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the n value");
      n=sc.nextInt();
      for(i=1;i<=n;i=i+2)
        {
          if(i%2==0)
            count++;
          { 
        System.out.println(i);

          }

        }
      //System.out.println("sum of the n odd numbers"+sum);

    }
  }