package constructor;

public class TestDemo {
	
	int a;
	int b;
	int m;
	int c;
	int d;
	String Name;
	String Velocity;
	boolean Boy;
	
	TestDemo(){    				// user Defined Constructor
		
		a=1000;				//initialization
		b=3250;
	}
	TestDemo(int c, int d){		// User Defined Constructor With Parameter
		
		a=c;
		b=d;
		
		
	}
	
	public void Addition() {		//Method
		
		System.out.println(m+a+b);
		System.out.println(a+b+c+d);
	}
	public void Work() {      // User Defined Non Static Methods
		
		System.out.println("Shivam");
		
		System.out.println("Patil");
		
	}
	
	public void Multiplication() {
		
		System.out.println(a*b);
		
	}
	public static void main(String[] args) {
		
		TestDemo TD = new TestDemo();
		
		System.out.println(TD.a);
		
		System.out.println(TD.Name);

		System.out.println(TD.Boy );
		
		TD.Addition();   // User Defined Method
		
		TD.Work();
		
		TD.Multiplication();
		
	}

}
