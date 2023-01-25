import java.util.*;
class Atm
  {
    public static void main(String args[])
    {
      int operation,deposit,withdraw,balance;
    
      Scanner sc=new Scanner(System.in);
      System.out.println("deposit");
      System.out.println("withdraw");
      System.out.println("balance");
      System.out.println("select one");
      deposit=sc.nextInt();
      withdraw=sc.nextInt();
      balance=sc.nextInt();
      operation=sc.nextInt();
switch(operation)
  {
    case 1:
      balance=deposit+withdraw;
      System.out.println("enter the amount"+balance);
      break;
    case 2:
      deposit=balance-withdraw;
      System.out.println("enter the amount"+deposit);
      break;
    default:
      System.out.println("invalid operation"+balance);
    
      
      
      
  }
      
    }
  }