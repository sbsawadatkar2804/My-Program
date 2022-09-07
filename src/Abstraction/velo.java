package Abstraction;

public interface velo {
	
	static void m() {				// Static Complete Method
		System.out.println("m is Running");
	}
	
	
	void Q1();		// Incomplete Method 
	void Q2();		// Incomplete MMethod
	
	default void Q3() {				// Complete Method
		System.out.println("Q3 is Running");
	}
	



}
