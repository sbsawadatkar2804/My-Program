package TyppesOfVeribale;

public class Veriable {
	
	static int a=10;       //Global Variable
	
	public void Demo() {
			int a = 50;
			int b = 20;  			// Local Variable
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
	}
	public void Demo1() {
		int c=30;				// Local Variable
		System.out.println(a);
	//	System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Veriable x = new Veriable();       // Object
		
		x.Demo();
		x.Demo1();
	}
}
