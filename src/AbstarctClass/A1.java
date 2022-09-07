package AbstarctClass;

public class A1 extends A{			// Concrete Class
	
	public void show() {
		System.out.println("Running Show Method");
	}
	public void blank() {
		System.out.println("Running Blank Method");
	}
	
	public static void main(String[] args) {
		
		A1 x = new A1();
		
		x.blank();
		x.display();
		x.show();
		System.out.println(x.a);
		System.out.println(x.b);
		System.out.println(x.c);
	}
	

}
