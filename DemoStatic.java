class DemoStatic
{
  static int count;
  //per is constant
 static final double per=100.0;
  int no;
  static{
	   count=0;
	   System.out.println("This is static block");
  }
  DemoStatic(int no)
  {
     count++;
	 this.no = no;	
  }
  static void getCount()
  {
	System.out.println("Count of objects created is  :"+count);   
  }
  void display()
  {
	  System.out.println("percentage= "+per);
	  System.out.println("no="+no);
  }
 
  public static void main(String args[])
  {
	     DemoStatic ob=new DemoStatic(12);
	     DemoStatic ob1=new DemoStatic(13);
		 DemoStatic ob2=new DemoStatic(14);
		 DemoStatic ob3=new DemoStatic(15);
		  getCount();
		  System.out.println("per"+DemoStatic.per);  
		  ob.display();
		//  ob.per=110;
		   ob.display();
		  ob1.display();

  }
}