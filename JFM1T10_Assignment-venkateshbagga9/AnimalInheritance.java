/*   JFM1T10_Assignment2:

     Create a class Animal that has a method makeSound(). 
     Then create two subclasses of Animal class: Horse and Cat that extends Animal class and 
     provide their specific implementation of makeSound() method.

     Sample Output:
     The animal makes a sound
     The Horse says: wee wee
     The Cat says: meow meow

*/
class Animal
  {
    void Sound()
    {
      System.out.println("The animal makes a sound");
    }
  }
class Horse extends Animal
  {
    void Sound()
    {
      super.Sound();
      System.out.println("The Horse says: wee wee");
    }
    

  }
class Cat extends Animal
  {
    void Sound()
    {
      System.out.println("The Cat says: meow meow");
    }
  }

class  AnimalInheritance {
  public static void main(String[]args)
  {
    Horse a=new Horse();
    Cat b=new Cat();
    a.Sound();
    b.Sound();
  }

//Add Animal class and Create Sound() method 

//Add Horse class that extends Animal class

//Add Cat class that extends Animal class


 
//Add main method here

//Create all 3 Animal objects and add to an array 

//Loop over the array and print sound it makes



