public class Main(){
	public static int square(int x){
	return x*x;
	}
	public static void main(String[] agrs){
	for (int i=1;i<=20;i++){
	int result=square(i);
	System.out.println("square of"+i+"Is "+result);
	}
	}
	}