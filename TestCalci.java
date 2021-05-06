import mypack.Calculator;
class TestCalci
{
  public static void main(String ar[])
   {
     Calculator c=new Calculator();
	 int sum = c.add(12,12);
	 int sum1 = c.add();
	  double sum2 = c.add(12.5,12.3);
	 System.out.println("ADDITION = "+ sum);
	 System.out.println("ADDITION = "+ sum1);
	 System.out.println("ADDITION of double= "+ sum2);
   }
}
