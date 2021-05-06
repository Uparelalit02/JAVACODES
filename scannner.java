import java.util.scanner;
import java.io.Console;
public class BuiltInpackage
{
	public static void main(String[] args)
	{
		Data d=new Data();
		System.out.println(d);
		Console c=new System.console();
		System.out.println("Enter name");
		String name=c.readLine();
		System.out.println("hello"+name);
		
	}
}