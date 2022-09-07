package Casting;

public class TestCasting {
	
	public static void main(String[] args) {
		
		
		
		SuperClass sc = new SubClass();
		sc.car();
		sc.money();
		sc.mobile();
		
		SuperClass sd = new SuperClass();
		sd.car();
		sd.money();
		sd.mobile();
		
		
		
	}

}
