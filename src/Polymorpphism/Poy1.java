package Polymorpphism;

public class Poy1 {
	
	public void Sample(int a) {
		
		System.out.println("Value Of a = " + a);
		
	}
	
	public void Add(int a, int b) {
		System.out.println("Addition = " +(a+b));
	}
	
	public void Mul(int a, int b, int c) {
		System.out.println("Miltiplication = "+ (a*b*c));
	}
	
	public static void main(String[] args) {
		
		Poy1 v = new Poy1();
		
		//v.Add(10);
		v.Add(20, 30);
		v.Mul(100, 30, 250);
	}

}
