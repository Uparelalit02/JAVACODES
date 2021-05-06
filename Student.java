  class Student
  {//encapsulates variable and method
   //class variable  or instance variable
    int roll_No;
    String std_Name;
    //returntype methodname(argument){}
    void setRoll(int roll)
    {
        roll_No= roll;
    }
   void setName(String std_Name)
    {
       std_Name=this.std_Name;
    }
  int getRoll()
    {
       return roll_No;
   }
  String getName()
    {
       return std_Name;
    }
    public static void main(String ar[])
    {
        int n=12;
      Student ob = new Student();
        ob.roll_No=13;
        ob. std_Name="ABCD";
     System.out.println("Roll no="+ob.roll_No);
      Student ob1= new Student();
       ob1.setRoll(23);
       ob1.setName("rrr");
      System.out.println("Roll no is :"+ob1.roll_No);
      //declaring and initializing an object is known as object instantiation.
        // class name object_name = new constructor();
    //   Student ob = new Student();
          //access method
   
    //  int r = ob.getRoll();
   //  System.out.println("Roll no is :"+r);
  }
  }