/* JFM1T10_Assignment1:

   Write a program to demonstrate Constructor chaining in Java 
   Add atleast 3 constructors

   Sample Output:
   Parent class default constructor
   Child class default constructor
   Parent class one-argument constructor
   Child class one-argument constructor

*/

class Parent
{
  Parent()
  {
    System.out.println("Parent class default constructor");
  }
  Parent(int x)
  {
    System.out.println("Parent class one-argument constructor");
  } 
}
class Child extends Parent
  {
    Child() 
    {
    
      System.out.println("Child class default constructor");
    }
  Child(int x)
    {
      
      super(x); 
      System.out.println("Child class one-argument constructor");
    }
  }
 class ConstructorChaining
  {
    public static void main(String[]args)
    {
      Child obj=new Child();
      Child obj1=new Child(10);
    }
  }



}

