public class Demo1
{
	 // access modifier to varaibles
	 int x;//default
	 private int y;//this can be accessed within class.Out of class you can not use it
	 public int z; // this variable can be accessed anywhere(within class,out of class,within package and out of package
	 Demo1()
	 {
		  System.out.println("This is no argument constructor");
		  x=10;
		  y=12;
		  z=13;
          int z1=x+y+z;
	 }
	 public Demo1(int x1,int y1,int z1)
	 {
		 x=x1;
		 y=y1;
		 z=z1;
	 }
	 void disp()
	 {
		 System.out.println("default variable x:"+x);
		 System.out.println("private variable y:"+y);
		 System.out.println("public variable z:"+z);
		 System.out.println("addition is"+ add());
	 }
	  void  setVar(int x,int y,int z)
	 {
		 this. x=x;
		 this.y=y;
		 this.z=z;
	 }
	 private int add()
	 {
		 return x+y+z;
	 }
	
}
