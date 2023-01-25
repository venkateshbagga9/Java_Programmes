import java.util.*;
class Strong
  {
    public static void main(String args[])
    {
      int digit=0,num,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the num value");
      num=sc.nextInt();
      int x=num;
    
  while (num > 0)
    {
      digit = num % 10;
      int fact=1;
      for (int i=1;i<=digit;i++)
      {
        fact=fact*1;
       }
      sum=sum+fact;
      num=num/10;
      
    }
      if(x==sum)
      {
        System.out.println("the number is a strong number ");
      }
      else
      {
        System.out.println("the number is  not a strong number ");
      }
  }
  }