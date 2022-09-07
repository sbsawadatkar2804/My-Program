package Casting;

public class Upcasting1 extends Upcasting{
	
	public void A() {
		System.out.println("Running A1");
	}
	
	public void B() {
		System.out.println("Running B1");
	}
	public static void C() {
		System.out.println("Running C");
	}
	
	public static void D() {
		System.out.println("Running D");
		
	}
	
	public void E() {
		System.out.println("Running E");
	}
	public static void main(String[] args) {
		
		Upcasting1 u = new Upcasting1();
		u.A();
		u.B();
		u.C();
		 
		Upcasting p = new Upcasting();
		p.A();
		p.B();
		p.C();
	}
}
