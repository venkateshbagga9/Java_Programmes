/* JFM1T9_Assignment3:
     Create a base class Teacher and a sub class ComputerTeacher.
     class ComputerTeacher extends the designation and collegename properties and work() method from base Teacher class,
     you need not declare these properties and method in ComputerTeacher sub class .
     Try accessing these properties using child class object in Main method.
  
     Sample Output:
     Designation       CollegeName
     ComputerTeacher      IIT
*/

class Teacher
  {
  String Designation="ComputerTeacher";
  String CollegeName="IIT";
  public void work()
  {
     System.out.println(Designation+ " "+CollegeName);
  }
}
class ComputerTeacher extends Teacher 
{
  public static void main(String args[])
  {
    System.out.println("Designation      CollegeName");
    ComputerTeacher obj=new ComputerTeacher();
    System.out.print(obj.Designation+ "     ");
     System.out.print(obj.CollegeName);
    
  }
}



