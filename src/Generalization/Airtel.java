package Generalization;

public class Airtel implements SimCard{
	
	public void Calling() {
		System.out.println("Limited Calling");
	}
	
	public void SMS() {
		System.out.println("Per Day 90 SMS");
	}
	
	public void Internet() {
		System.out.println("Per Day 1 GB");
	}
	
	public void Recharge() {
		System.out.println("Only Rs. 650 Per Month");
	}

}
