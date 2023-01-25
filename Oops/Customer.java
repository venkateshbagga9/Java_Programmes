import java.util.*;
class Customer
  {
    
    int cust_Id;
    String cust_name;
    String customer_grade;
    String product;
    int quantity;
    char stock_status;
    double total_bill;
    String delivery_location;
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Customer ct[]=new Customer[3];
      for(int i=0;i<3;i++)
        {
          ct[i]=new Customer();
         System.out.println("enter Customer Id");
          ct[i].cust_Id=sc.nextInt();
          System.out.println("enter Customer name");
          ct[i].cust_name=sc.next();
          System.out.println("enter customer Grade");
          ct[i].customer_grade=sc.next();
          System.out.println("enter product name");
          ct[i].product=sc.next();
          System.out.println("enter No.of units");
          ct[i].quantity=sc.nextInt();
        System.out.println("enter stock status-Y/N ");
          ct[i].stock_status=sc.next().charAt(0);
      System.out.println("enter Total Bill amount");
          ct[i].total_bill=sc.nextDouble();
        System.out.println("enter delivery location");
          ct[i].delivery_location=sc.next();
        }
      System.out.println("the student details are");
      for(int i=0;i<3;i++)
        {
System.out.println(ct[i].cust_Id+" "+ct[i].cust_name+" "+ct[i].customer_grade+" "+ct[i].product+" "+ct[i].quantity+" "+ct[i].stock_status+" "+ct[i].total_bill+" "+ct[i].delivery_location);
        }
      
    }
  }