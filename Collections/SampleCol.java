import java.util.*;
class SampleCol
  {
    public static void main(String args[])
    {
      ArrayList<Integer> arr=new ArrayList<Integer>();
      arr.add(23);
      arr.add(24);
      arr.add(9);
      arr.add(99);
      arr.add(18);
      arr.add(27);
      arr.add(34);
      System.out.println("after adding all the elements"+arr);
      arr.remove(5);
      arr.remove(3);
      System.out.println("after Removing the elements"+arr);
      arr.add(5,45);
      arr.add(3,54);
      System.out.println("after adding the elements"+arr);
      }
  }