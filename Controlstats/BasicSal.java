/*WAP to input basic salary of an employee and calculate its Gross     salary according to following:
    Basic Salary <= 10000 : HRA = 20%, DA = 80%
    Basic Salary <= 20000 : HRA = 25%, DA = 90%
    Basic Salary > 20000 : HRA = 30%, DA = 95% */

import java.util.*;
class BasicSal
  {
    public static void main(String args[])
    {
      int basic,hra,da,Gross;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Basic salary");
      basic=sc.nextInt();
      if(basic<=10000)
      {
      hra=(basic*20)/100;
        da=(basic*80)/100;
        Gross=(basic+hra+da);
        System.out.println("the Gross salary is"+Gross);
      }
      else if(basic>10000&&basic>=20000)
        {
        hra=(basic*25)/100;
        da=(basic*90)/100;
        Gross=(basic+hra+da);
        System.out.println("the Gross salary is"+Gross);
        }
            else if(basic<=20000)
        {
        hra=(basic*30)/100;
        da=(basic*95)/100;
        Gross=(basic+hra+da);
        System.out.println("the Gross salary is"+Gross);
        }
      else
            {
       System.out.println("he is not eligible for HRA and DA");
            }
      
        
        
      
    }
  }