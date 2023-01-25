interface Area
  {
  abstract public void areaCalculation();
  }
class Rectangle implements Area
  {
    public void areaCalculation()
    {
      int l=12,b=4;
      int a=l*b;
    System.out.println("Area of a Rectangle:- "+a);
    }
  }
 class Square implements Area
  {
    public void areaCalculationcal()
    {
      int a1=4;
      int ar=a1*a1;
      System.out.println("Area of a Square:- "+ar);
      
    }
  }
class Circle implements Area
  {
    public void areaCalculation()
    {
      float r1=9f;
      float arc=(3.14f*r1*r1);
      System.out.println("Area of a Circle :-"+arc);
    }
  }
class Interface
  {
    public static void main(String args[])
    {
      Area r=new Rectangle();
      Area s=new Square();
      Area c=new Circle();
      
      r.areaCalculation();
      s.areaCalculation();
      c.areaCalculation();
    }
  }
