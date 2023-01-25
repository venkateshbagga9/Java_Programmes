import java.util.*;
class Arrays2
  {
    public static void main(String args[])
    {
      String a[]=new String[4];
      Scanner sc=new Scanner(System.in);
     System.out.println("enter array elements");
      for(int i=0;i<4;i++)
        {
          a[i]=sc.next();
        }
      System.out.println("the array elements are ");
      for(int i=0;i<4;i++)
        {
          System.out.print(a[i]+" ");
        }      
              }
  }