class Main {
	public void display1(){
		System.out.println("without parameter");
	}
	public void display2(int a){
		System.out.println("single parameter'"+a);
	}
	public static void main(String[] args){
		Main obj =new Main();
		obj.display1();
		obj.display2(25);
		System.out.println(Math.sqrt(4));
	}
}