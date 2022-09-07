package Encapsulation;

public class Class1 {
	
	private int a = 50;
	static private int b = 60;
	
	public static void set(int c) {
		
		c=b;
		
		System.out.println(c);
	}
	
	public int get() {
		
		return a;
	}
	public static void main(String[] args) {
		Class1 c = new Class1();
		
		System.out.println(c.a);
		System.out.println(c.b);
		 
		
		
	}
	

}
