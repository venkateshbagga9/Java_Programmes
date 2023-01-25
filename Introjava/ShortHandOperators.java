import java.util.Scanner;
public class ShortHandOperators 
{
public static void main(String args[])
//main method
  {
    int a=10,b=20;
    System.out.println("a*=b is :"+(a*=b));
    System.out.println("a-=b is :"+(a-=b));
    System.out.println("a/=b is :"+(a/=b));
    System.out.println("a%b is :"+(a%=b));
    
  

/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/
    Scanner sc=new Scanner(System.in);
    int x,y;
    System.out.println("Enter the x value");
        x=sc.nextInt();
    System.out.println("Enter the y value");
    y=sc.nextInt();
    System.out.println("x*=y is :"+(x*=y));
    System.out.println("x-=y is :"+(x-=y));
    System.out.println("x/=y is :"+(x/=y));
    System.out.println("x%=y is :"+(x%=y));
  }
}
    