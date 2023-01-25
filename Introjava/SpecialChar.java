//WAP to input any character and check whether it is alphabet, digit or special character
import java.util.*;
class SpecialChar
{
public static void main(String[] args) 
  {
Scanner sc = new Scanner(System.in);
System.out.println("Enter any caracter : ");
        char x = sc.next().charAt(0);

    if((x >= 'a' && x <= 'z') || (x >= 'A' && x<= 'Z')) 
    {
System.out.println(" x is A ALPHABET.");
        } 
        else if(x >= '0' && x <= '9') 
        {

             System.out.println("x is A DIGIT.");
}
        else
        {

    System.out.println("x is A SPECIAL CHARACTER.");
        }
    
    }
}