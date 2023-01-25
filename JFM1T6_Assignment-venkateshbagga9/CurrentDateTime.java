/* JFM1T6_Assignment4:

   Write a program to display current date-time. Hint: java.util package contains Date class.
   
   Sample Output:
   Date in Indian Timezone (IST) : 18-02-21 10:20:195 IST

*/

//import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
public class CurrentDateTime 
{
    public static void main(String args[]) 
  {
  SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss z");  
    Date date = new Date();  
    formatter.setTimeZone(TimeZone.getTimeZone("IST"));
    System.out.println("Date in indian timezone(IST) is :"+formatter.format(date));  
     
  }
//main method

/* 
capture today's date by
Date today = new Date();
*/

//create DateFormat and set TimeZone 


//display this date on IST time zone 

}