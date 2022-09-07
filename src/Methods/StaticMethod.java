package Methods;

public class StaticMethod {
	
	
	public static void  M1() {       // Static User Defined Method 1
		System.out.println("Static Method From M1");
	}
	public static void M2() {       // Static User Defined Method 2
		System.out.println("Static Method From M2");
	}
	
public static void main(String[] args) {    // System Defined Method Or Main Method
		
		System.out.println("Main Method Started");
		
		M1();
		M2();
		
		System.out.println("Main Method Ended");
	}

}
