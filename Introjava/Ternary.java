class Ternary
  {
    public static void main(String args[])
    {
      int p=18,q=9;
      int r=(p<q)?p:q;
      System.out.println(r);
int s=27,t=36,u=45;
      int v=(s<t)?
      (s<u?s:u):
      (t<u?t:u);
      System.out.println(v);
    }
  }