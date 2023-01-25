import java.util.*;
class Switch3
  {
    public static void main(String args[])
    {
      int operation,p,q,r;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter the operation want to Do");
      operation=sc.nextInt();
       p=sc.nextInt();
       q=sc.nextInt();
      switch(operation)
        {
  case 1:
            r=p+q;
    System.out.println("Enter the value for Addition value"+r);
        break;
  case 2:
            r=p-q;
    System.out.println("Enter the value for subtraction  value"+r);
        break;
  case 3:
            r=p*q;
    System.out.println("Enter the value multiplication value"+r);
        break;
        case 4:
            r=p/q;
    System.out.println("Enter the value division value"+r);
        break;
        
          default:
        System.out.println("invalid operation");
        
          
        }
      
    }
  }