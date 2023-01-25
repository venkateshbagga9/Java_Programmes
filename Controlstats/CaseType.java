//WAP to check whether a character is uppercase or lowercase alphabet.
import java.util.*;
class CaseType
{
public static void main(String args[]) 
{
  
Scanner sc = new Scanner(System.in);
System.out.println("Enter any caracter ");
char x=sc.next().charAt(0);
if((x>='A')&&(x<='Z'))
    {
    System.out.println("x is a Upper case letter ");
    }
  else
  {
  System.out.println("x is a Lower case letter ");
  }
  }
}
