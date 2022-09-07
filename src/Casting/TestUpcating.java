package Casting;

public class TestUpcating {
	
	public static void main(String[] args) {	// Upcasting
		
		Upcasting c = new Upcasting1();
		c.A();
		c.B();
		c.C();
		
		
		// Down Casting
		
		Upcasting1 n = (Upcasting1) new Upcasting();
		
		n.A();
		n.B();
		n.E();
		n.C();
		n.D();
		
	}

}
