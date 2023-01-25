/* JFM1T10_Assignment4:

     Create an interface named MyStack in package MyCollection with following methods- 
     void push(int I) 
     int pop() 
     Create two sub classes inheriting the MyStack interface.  
   1.class FixedStack that can accept a fixed numbers of integers. 
     The size of the Stack will be specified in the constructor. 
     If the number of integers exceed the size, “Stack overflow” message should be displayed. 
   2.class VariableStack that can accept numbers more than its size. 
     The size of the Stack will be specified in the constructor. 
     If the number of integers exceed the size, the stack should automatically grow to accommodate the new element. 
     Make a program that checks the implementation of both the classes. 
     Prompt the user for the  values to be input from the terminal.

     Sample Input:
     Enter a a few comma separated integers (Ex: 1,7,4)
     1,2,3,4,5

     Expected Output:
     Fixed Stack Overflows. Failed to push the integer:4
     Dynamic Stack Overflow. Increasing the stack length...Done
     Fixed Stack Overflows. Failed to push the integer:5
     Dynamic Stack Overflow. Increasing the stack length...Done
     Printing all elements of Fixed Stack
     3
     2
     1
     Printing all elements of Dynamic Stack
     5
     4
     3
     2
     1

*/

//Create a interface name MyStack

//Add a class FixedStack that implements StackOperations and create a methods push and pop

//Add a class DynamicStack that implements StackOperations and create a methods push and pop

interface MyStack
{
        void push(int item);
        int pop();
}
class FixedStack implements MyStack
{
  private int stk[ ];
  private int tos;
  FixedStack(int size)
  {
    stk=new int[size];
    tos=-1;
  }
  public void push(int item)
  {
    if(tos==stk.length-1)
    { 
      System.out.println("Stack Overflows");int t[ ]=new int[stk.length * 2];
      for(int i=0;i<stk.length;i++)
        t[i]=stk[i];
      stk=t;
      stk[++tos]=item;
    }else
      stk[++tos]=item;
  }
  public int pop()
  {
    if(tos<0)
    {
      System.out.println("Stack Underflows");
      return 0;
    }
    else
      return stk[tos--];
  }
}
class DynStack implements MyStack
{
  private int stk[ ];
  private int tos;
  DynStack(int size)
  {
    stk=new int[size];
    tos=-1;
  }
  public void push(int item)
  {
    if(tos==stk.length-1)
    {
      System.out.println("Stack Overflows.");
      int t[ ]=new int[stk.length * 2];
      for(int i=0;i<stk.length;i++)
        t[i]=stk[i];
      stk=t;
      stk[++tos]=item;
    }
    else
      stk[++tos]=item;
  }
  public int pop()
  {
    if(tos<0)
    {
      System.out.println("Stack Underflows.");
      return 0;
    }
    else
      return stk[tos--];
  }
}
class StackOperations
{
  public static void main(String args[ ]) 
  {
    FixedStack fs=new FixedStack(3);
    DynStack ds=new DynStack(5);
    MyStack mystk;
    for(int i=0;i<3;i++)
      fs.push(i);
    System.out.println("Printing all elements of Fixed Stack");
    for(int i=1;i<4;i++)
      System.out.println(fs.pop());
    for(int i=0;i<7;i++)
      ds.push(i);
    System.out.println("Printing all elements of Dynamic Stack");
    for(int i=0;i<5;i++)
      System.out.println(ds.pop());
    mystk=fs;
    for(int i=0;i<3;i++)
      mystk.push(i);
    System.out.println("Fixed length Stack Contents using interface reference");
    for(int i=0;i<3;i++)
      System.out.println(mystk.pop());
    mystk=ds;
    for(int i=0;i<7;i++)
      mystk.push(i);
    System.out.println("Dynamic length Stack Contents using interface reference");
    for(int i=0;i<7;i++)
      System.out.println(mystk.pop());
  }


//Add main method here

}