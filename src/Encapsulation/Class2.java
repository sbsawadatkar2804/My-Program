package Encapsulation;

public class Class2 extends Class1{

	public static void main(String[] args) {
		
		Class1.set(200);
		
		Class2 x = new Class2();
		
		int y = x.get();
		
		System.out.println(y);
				
	}
}
