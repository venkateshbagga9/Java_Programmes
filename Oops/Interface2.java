interface Root
  {
    abstract public void roots();
  }
class Nsquare implements Root
  {
    public void roots()
    {
      double n=9;
      double sqr=n*n;
      System.out.println("Square of"+n+"is: "+sqr);
    }
  }
class Cube implements Root
  {
    public void roots()
    {
      double n1=9;
    double cb=n1*n1*n1;
      System.out.println("Cube of"+n1+"is: "+cb);
    }
  }
class Squareroot implements Root
  {
    public void roots()
    {
      double rt=81;
      double result = Math.sqrt(rt);
      System.out.println("Square root of"+rt+"is: "+result);
    }
  }
class Interface2
  {
    public static void main(String args[])
    {
      Root obj=new Nsquare();
      Root obj1=new Cube();
      Root obj2=new Squareroot();
      obj.roots();
      obj1.roots();
      obj2.roots();
    }
  }