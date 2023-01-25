class Employee
  {
    String empname;
    int empId;
    String designation;
    long salary;
   
    public static void main(String args[])
    {
      Employee emp=new Employee();
      Employee emp2=new Employee();
     Employee emp3=new Employee();
      emp.empname="ram";
      emp.empId=301;
      emp.designation="Developer";
      emp.salary=50000;
      emp2.empname="lakshman";
      emp2.empId=302;
      emp2.designation="Tester";
      emp2.salary=40000;
      emp3.empname="Bharath";
      emp3.empId=303;
      emp3.designation="Support Staff";
      emp3.salary=30000;
      System.out.println(emp.empname+" "+emp.empId+" "+emp.designation+" "+emp.salary);
      System.out.println(emp2.empname+" "+emp2.empId+" "+emp2.designation+" "+emp2.salary);
      System.out.println(emp3.empname+" "+emp3.empId+" "+emp3.designation+" "+emp3.salary);
      
    }
  }