/* JFM1T10_Assignment3:

     Create an abstract class Shape with following data member and methods- 
     Create data members for height and width.
     Add getter and setter methods for height and width.
     Create methods for finding area and perimeter.
     Create three subclasses Square, Rectangle and EquilateralTriangle that extends Shape class and define both the methods.
     Write a program that will find the area and perimeter of 3 Shapes and print the details for all. 
     Prompt the user for the  values to be input from the terminal.
 
     Sample Input:
     Enter Width of Rectangle in meters
     10
     Enter Length of Rectangle in meters
     5
     Enter width of Equilateraltriangle
     15
     Enter radius of circle
     60

     Expected Output:
     Rectangle width: 10.0 meters and length: 5.0 meters
     Resulting area: 50.0 square meters
     Resulting perimeter: 30.0 meters 

     EquiTriangle side: 15.0meters
     Resulting area: 97 square meters
     Resulting perimeter: 45.0 meters 

     Circle radius : 60.0meters
     Resulting area: 11310 square meters
     Resulting perimeter: 377 meters  

*/

import java.util.scanner;
abstract class Shape
{
  Scanner s= new Scanner(System.in);
    System.out.println(" Enter Width of Rectangle in meters");
    double a=s.nextDouble();
    System.out.println("Enter Length of Rectangle in meters");
    double b=s.nextDouble();
    System.out.println("Enter width of Equilateraltriangle");
    double c=s.nextDouble();
    System.out.println("Enter radius of circle");
    double d=s.nextDouble();
    Rectangle obj = new Rectangle();
    shape = obj;
    shape.setValues(a, b);
    
    System.out.println();
    System.out.println("Rectangle width: "+a+" meters and length: "+b+" meters");
    System.out.println("Resulting area: " + shape.getArea()+" square meters");
    System.out.println("Resulting perimeter: "+shape.getPerimeter()+" meters");
}
  }





//Add Square class that extends Shape class

//Add Rectangle class that extends Shape class

//Add EquilateralTriangle class that extends Shape class

class AreaPerimeter {

//Add the main method here and find Area and Perimeter 

//Use the scanner class to provide height and width at execution time

/*
Scanner s= new Scanner(System.in);
System.out.println("Enter the height of triangle");
EquilateralTriangle triangle=new EquilateralTriangle();
triangle.setHeight(s.nextInt());
*/


}