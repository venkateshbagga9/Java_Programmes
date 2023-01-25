import java.util.*;
class Arrays3
{
  public static void main(String args[])
  {
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the length of an Array");
    int a=sc.nextInt();
    int x[]=new int[a];
    System.out.println("enter the Array elements");
    for(i=0;i<x.length;i++)
      {
        x[i]=sc.nextInt();
      }
    for(i=0;i<x.length;i++)
    {
      if(x[i]<0)
      {
        System.out.println("The array elements are "+x[i]);
      }
    }
    
  }
}