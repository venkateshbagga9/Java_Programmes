import java.util.*;
class Switch
{
public static void main(String args[])
{
int number;
Scanner sc=new Scanner(System.in);
System.out.println("enter a value");
number=sc.nextInt();
switch(number)
{
case 1:
System.out.println("the month is january");
break;
case 2:
System.out.println("the month is feburary");
break;
case 3:
System.out.println("the month is march");
break;
case 4:
System.out.println("the month is april");
break;
case 5:
System.out.println("the month is may");
break;
case 6:
System.out.println("the month is june");
break;
case 7:
System.out.println("the month is july");
break;
default:
System.out.println("Invalid number given");
}
}
}
