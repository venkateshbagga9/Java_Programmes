class SwappingTwo
  {
    public static void main(String args[])
    {
      int a=20,b=40;
      System.out.println("before swapping a= "+a+" and b = "+b);
      a=a+b;  //60
      b=a-b;  //20
      a=a-b;  //40
      System.out.println("After swapping a ="+a+" and b = "+b);
      
      
    }
  }