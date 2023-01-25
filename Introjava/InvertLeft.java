import java.util.*;
class InvertLeft
  {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
        {
          for(int j=0;j<=i;j++)
            {
              System.out.print(" ");
            }
          for(int k=1;k<=i;k++)
            {
              System.out.print("*");
            }
          System.out.println("");
        }
    }
  }