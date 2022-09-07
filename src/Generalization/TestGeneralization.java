package Generalization;

public class TestGeneralization {
	
	public static void main(String[] args) {
		
		System.out.println("*****Jio*****");
		Jio j = new Jio();
		j.Calling();
		j.Internet();
		j.SMS();
		j.Recharge();
		
		
		System.out.println("*****Idea*****");
		Idea i = new Idea();
		i.Calling();
		i.Internet();
		i.SMS();
		i.Recharge();
		
		
		System.out.println("*****Airtel*****");
		Airtel a = new Airtel();
		a.Calling();
		a.Internet();
		a.SMS();
		a.Recharge();
		
	}

}
