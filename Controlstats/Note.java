import java.util.*;
class Note
  {
    public static void main(String args[])
    {
      int amount,res;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the amount");
      amount=sc.nextInt();
      if(amount>=1000)
      {
        res=amount/1000;
        System.out.println("the 1000 rupees notes are:"+res);
        amount=(amount-(res*1000));
      }
      if(amount>=100)
      {
        res=amount/100;
        System.out.println("the 100 rupees notes are:"+res);
        amount=(amount-(res*100));
      }
      if(amount>=50)
      {
        res=amount/50;
        System.out.println("the 50 rupees notes are:"+res);
        amount=(amount-(res*50));
      }
      if(amount>=10)
      {
         res=amount/10;
        System.out.println("the 10 rupees notes are:"+res);
        amount=(amount-(res*10));
      }
      if(amount>=1)
      {
       res=amount/1;
        System.out.println("the 1 rupees notes are:"+res);
       
      }
    
    }
  }

