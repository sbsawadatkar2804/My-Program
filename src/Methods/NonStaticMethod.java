package Methods;

public class NonStaticMethod {
	
	public void M3() {         // Non Static User Defined Method
		
	int a=12; 
	int  b=13;
	int c=a+b;
	System.out.println(c);
	}
	
	public static void main(String[] args) {    // Main Or System Defined Method
		
		NonStaticMethod x = new NonStaticMethod();   // Constructor And Object
		
		System.out.println();
		
		x.M3();
		
	}

}
