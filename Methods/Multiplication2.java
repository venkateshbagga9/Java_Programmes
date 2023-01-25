import java.util.*;
class Multiplication2
  
  {
    public static void multiplication(double a,double b)
    {
    double multi=a*b;
System.out.println("the multiplication of two numbers is "+multi);
    }
   
        public static void main(String args[])
    
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the x value");
      int x=sc.nextInt();
      System.out.println("enter the y value");
      int y=sc.nextInt();
      
      multiplication(x,y);
      //multiplication(x,y);


    }  
    
  }