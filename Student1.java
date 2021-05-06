class Student
{
  String name;
  Student()
  {
     name="UNKNOWN";
   }
	Student(String n)
	{
	  name=n;
    }
}
public class Student1
{
	 public static void main(String ar[])
	 {
		 Student s=new Student();		 
		 Student s1 =new Student("diems");
		 Student s2=new Student();	
	 }
}