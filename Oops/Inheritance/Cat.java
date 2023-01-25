class Animal
  {
    void sleep()
    {
      System.out.println("sleeping");
    }
    void run()
    {
      System.out.println("Running");
    }
  }
class Dog extends Animal
  {
    
    void bark()
    {
      System.out.println("barking");
    }
  }
class Cat extends Animal
  {
    void meows()
    {
      System.out.println("meows");
    }
  }
class TestInheritance
  {
    public static void main(String args[])
    {
      Cat obj=new Cat();
      obj.sleep();
      obj.run();
      obj.bark();
      obj.meows();
    }
  }