class Person
  {
    String name;
    int age;
    int gender;
    }
class Studentin extends Person
  {
    int roll_no;
    int standard;
    public void display()
    {  
      System.out.println("name"+name+"age"+age+"Gender"+gender)
    }
    public static void main(String args[])
    {
      Student obj=new Student();
      obj.name="Ram";
      obj.age=26;
      obj.Gender="Male";
      obj.roll_no=123;
      obj.standard=10;
    }
  }