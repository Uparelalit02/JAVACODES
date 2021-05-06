// Fig. 8.2: Time1Test.java
// Time1 object used in an app.
import java.util.Scanner;
public class Time1Test {
   public static void main(String[] args) {
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter hour,minute and second in 24 hour format:");
	   int h=sc.nextInt();
	   int m=sc.nextInt();
	   int s=sc.nextInt();
      // create and initialize a Time1 object
      Time1 time = new Time1(); // invokes Time1 constructor
   
      // change time and output updated time 
      time.setTime(h,m,s); 
      h=time.getHour();
	  System.out.println("hour is:"+h);
      System.out.println("24 hour time format :" +time.toUniversalString());      
	  System.out.println("12 hour time format :" +time.toString());     
   
   /*// displays a Time1 object in 24-hour and 12-hour formats
   private static void displayTime(String header, Time1 t) {
      System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
         header, t.toUniversalString(), t.toString());*/
   } 
} 