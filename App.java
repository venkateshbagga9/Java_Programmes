package com.bitlabs.AarogyaHospital;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
       Patient p[]=new Patient[3];
       DaoImpl d1=new DaoImpl();
       Scanner sc=new Scanner(System.in);
       boolean ch=true;
       try
       {
       while(ch)
       {
    	   System.out.println("******MENU*******");
    	   System.out.println("1.Patient Registration \n 2.Viewing all Patient Records \n 3.Search by Id \n 4.search patient by city \n 5. Search by age \n 6. change the recovery status \n 7.delete the patient by ID\n 0.exit");
    	   System.out.println("enter option");
    	   int num=sc.nextInt();
    	   int i;
		switch(num)
    	   {
    	   case 1:
    		   for(i=0;i<p.length;i++)
    		   {
    		   p[i]=new Patient();
    		   System.out.println("enter patient name");
    		   String pname=sc.next();
    		   p[i].setName(pname);
    		   System.out.println("enter patient age");
    		   int pAge=sc.nextInt();
    		   p[i].setAge(pAge);
       		   System.out.println("enter gender");
    		   String pgender=sc.next();
    		   p[i].setGender(pgender);
    		   System.out.println("enter city");
    		   String pcity=sc.next();
    		   p[i].setCity(pcity);
    		   System.out.println("enter address");
    		   String padr=sc.next();
    		   p[i].setAddress(padr);
    		   System.out.println("enter the date of admission");
    		   String doa=sc.next();
    		   p[i].setDate_of_admission(doa);
    		   System.out.println("enter aadhar card number");
    		   String aadhar=sc.next();
    		   if(aadhar.length()==12)
    		   {
    			   p[i].setAadhar_no(Long.parseLong(aadhar));
    		   }
    		   else
    			   break;
    		   System.out.println("enter mobile number");
    		   String phno=sc.next();
    		   if(phno.length()==10)
    		   {
    			   p[i].setContact_no(Long.parseLong(phno));
    		   }
    		   else
    			   break;
    		   System.out.println("enter guardian name");
    		   String gname=sc.next();
    		   p[i].setGuardian_name(gname);
    		   System.out.println("guardian contact number");
    		   Long gphno=sc.nextLong();
    		   p[i].setGuardian_phno(gphno);
    		   System.out.println("enter guardian address");
    		   String gadr=sc.next();
    		   p[i].setGuardian_address(gadr);
    		   //calling registration method 
    		   d1.patientRegistration(p[i]);
    		   
    		   }  	   
    		   
    		   break;
    	   case 2:
    		   System.out.println("here is all patient");
    		   try {
				d1.viewAllPatient();
    		   }
    		   catch(Exception e)
    		   {
    			   System.out.println(e);
    		   }
    	   case 3:
				System.out.println("Enter the patient ID");
				int pId=sc.nextInt();
				d1.searchPatientById(pId);
				break;
			case 4: 
				System.out.println("Enter the city");
				String pCity= sc.next();
				d1.searchPatientByCity(pCity);
				break;
			case 5:
				System.out.println("Enter the age start and end ");
				int start=sc.nextInt();
				int end= sc.nextInt();
				d1.searchPatientByAgeGroup(start, end);
				break;
			case 6:
				System.out.println("Enter the id for recovery ");
				int rId= sc.nextInt();
				d1.markPatientRecoveryById(rId);
				break;
			case 7:
				System.out.println("Enter the id for delete the patient info");
				int dId= sc.nextInt();
				d1.deletePatientById(dId);
				break;
				
    		   default:
    			   ch=false;
    			   break;
    	   }
       }
       
    	  
       }
       catch(Exception e)
       {
    	   System.out.println(e);
       }
    }
}
