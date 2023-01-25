/* JFM1T9_Assignment4:
     Extend and enhance the previous inheritance program where collegeName, designation and 
     work() method are common to all the teachers and declared in the base class in the way
     that all child classes like MathTeacher, EnglishTeacher and MusicTeacher do not need to 
     write this code and can use directly from base class. 

     Sample Output:
     Math Teacher         IIT
     English Teacher      IIT
     Music Teacher        IIT
*/

//Add Teacher class

//Add MathTeacher class

//Add EnglishTeacher class

//Add MusicTeacher class
  class Teacher
  {
    void display()
    {
      System.out.println("IIT");
    }
  }
class MathsTeacher extends Teacher
  {
    void work()
    {
      System.out.println("Maths Teacher     IIT");
    }
  }
class EnglishTeacher extends Teacher
{
  void work()
  {
    System.out.println("English Teacher   IIT");
  }
}
class MusicTeacher extends Teacher
{
   void work()
    {
      System.out.println("Music Teacher     IIT");
    }
}

class CollegePrincipal 
{
  public static void main(String[]args)
  {
    MathsTeacher obj=new MathsTeacher();
    EnglishTeacher obj2=new EnglishTeacher();
    MusicTeacher obj3=new MusicTeacher();
    obj.work();
    obj2.work();
    obj3.work();
  }

//Add the main method here and create all different types of Teacher objects and print there college name designation.


}