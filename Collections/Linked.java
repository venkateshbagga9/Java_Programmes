import java.util.*;
class Linked
  {
    public static void main(String args[])
    {
      HashSet<Integer> hs=new HashSet<Integer>();
      hs.add(12);
      hs.add(23);
      hs.add(34);
      hs.add(45);
      hs.add(56);
      hs.add(null);
      System.out.println(hs);
      LinkedList<Integer> ll=new LinkedList<Integer>(hs);
      System.out.println(ll);
      ArrayList<Integer> al=new ArrayList<Integer>(hs);
      System.out.println(al);



      
      /*Stack<Integer> stk=new Stack<Integer>(hs);
      System.out.println(stk);*/
      //stack doesn't convert into hashset
    }
  }