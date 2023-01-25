class Employee2
  {
    String empname;
    int empId;
    String designation;
    double salary;
  public void insertRecord(String name,int number,String role,double sal)
    {
      empname=name;
      empId=number;
      designation=role;
      salary=sal;
    }
    public void display()
    {
      System.out.println(empname+" "+empId+" "+designation+" "+salary);
    }
    public static void main(String args[])
    {
      Employee2 empname=new Employee2();
      Employee2 empname1=new Employee2();
      empname.insertRecord("Krishna",301,"developer",50000);
      empname.display();
      empname1.insertRecord("Radha",302,"Tester",40000);
      empname1.display();
    }
  }