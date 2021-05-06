package myPack;
class calculator
{

int add(int i,int j)
{
	return i+j;
}
int subtract(int i , int j)
{
	return i-j;
}
	public static void main(String[] agrs){
	calculator c=new calculator();
	calculator sum=c.add(12,21);
	System.out.println("sum"+sum);
	}
	
}
