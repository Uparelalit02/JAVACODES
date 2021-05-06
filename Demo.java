//JAVA FIRST PROGRAM : Addtion of two integers.
import java.util.Scanner; //class Scanner used to take user input.
class Demo
   {
      public static void main(String args[])
         {
         //create object for Scanner class
        // classname object_name =new classname();
           Scanner sc =new Scanner(System.in);//System.in indicates standard input stream
                    int n1,n2;
         // comapre two integers using if ,relational and equality <,>,<=,>=, ==,!=
                    System.out.println("Enter Number 1 and Number 2");
                    n1=sc.nextInt();//read first number from user
	n2 = sc.nextInt();
              System.out.println("Comparing two integer values");
                  if (n1==n2)
	System.out.printf("%d == %d",n1,n2);
	if(n1>n2)
	System.out.printf("%d > %d",n1,n2);
         
                  if(n1<n2)
	System.out.printf("%d < %d",n1,n2);
                /*    int x=10;
                    int y =30;
                    int maxValue; 
                      maxValue=(x > y) ? x: y;
                    System.out.println("Greatest number is  : "+maxValue);
                    System.out.println(y>>2);
                  if(x>y)
	    {
                                 System.out.printf("%s%d%s ","The value ",x,"is greater");
	     }
	else{
	            System.out.printf("%s%d%s ","The value ",y,"is greater");
}*/
	

        }
 }       

