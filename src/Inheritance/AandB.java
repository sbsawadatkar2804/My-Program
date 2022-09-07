package Inheritance;

public class AandB implements A,B{     		// Multiple Inheritance, means single sub class Acquiring properties of two super class in Interface 
	
	public void Q1() {						// Implementation Class
		System.out.println("Method Q1 Is Running");
	}
	public void Q2() {
		System.out.println("Method Q2 Is Running");
	}
	public void Q3() {
		System.out.println("Method Q3 Is Running");
	}
	public void Q4() {
		System.out.println("Method Q4 Is Running");
	}
	
	public static void main(String[] args) {
		
		AandB x = new AandB();
		x.Q1();
		x.Q2();
		x.Q3();
		x.Q4();
	}
}
