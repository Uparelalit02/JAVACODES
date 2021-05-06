import java.util.Scanner;
class StringExample
{
  public static void main(String args[])
  { 
      String s1,s2;
     System.out.println("Enter String 1 and 2:");
	 Scanner sc= new Scanner(System.in);
	 s1=sc.nextLine();
	 s2=sc.nextLine();
    System.out.println("length: "+s1.length());
	System.out.println("Compare To: " + s1.compareTo(s2));
	System.out.println("Concatenation: "+ s1.concat(s2));
	System.out.println("Convert to lowercase :"+s1.toLowerCase());
  }
}