import java.util.*;
class GetSetCol
  {
    public static void main(String args[])
    {
      ArrayList arr=new ArrayList();
      arr.add(9);
      arr.add("Ram");
      arr.add(99.9f);
      arr.add("A");
      System.out.println("the elements are :"+arr);
      System.out.println(arr.get(1));
      System.out.println(arr.set(0,1));
      System.out.println("the elements are :"+arr);
    }
  }