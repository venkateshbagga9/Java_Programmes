import java.util.*;

public class Assign 
{
  public static void main(String args[])
  {
  int a=20,b=10;
  
     b= a-- - --a;
    int c=a--;
     int d=a>>2;
     int e=a&b;
    System.out.println("The expression of (a--)-(--a) is "+b);
   System.out.println("The expression of a-- is "+c);
   System.out.println("The expression of a>>2 is "+d);
   System.out.println("The expression of a&b is "+e);


    Scanner sc=new Scanner(System.in);
      System.out.println("Enter p value: ");
       int p=sc.nextInt();
      System.out.println("Enter q value: ");
       int q=sc.nextInt();
    q= p-- - --p;
    int r=p--;
     int s=p>>2;
     int t=p&q;
    System.out.println("The expression of (p--)-(--p) is "+q);
   System.out.println("The expression of p-- is "+r);
   System.out.println("The expression of p>>2 is "+s);
   System.out.println("The expression of p&q is "+t);
  }
}