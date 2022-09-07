package Abstraction;

public class velo1 implements velo {
	
	public void Q1()
	{
		System.out.println("Q1 is running");
	}
	public void Q2() {
		System.out.println("Q2 is running");
	}
	
	static void m() {						
		System.out.println("m is an Running");
	} 
	
	 public void Q3() {
		System.out.println("Hey Default Is Running");		// implements is done with Default Keyword 
	}
	
	public static void main(String[] args) {
		
		velo1 x = new velo1();
		x.Q1();
		x.Q2();
		x.Q3();
		velo.m();
		velo1.m();
		x.m();
		
	}
}
