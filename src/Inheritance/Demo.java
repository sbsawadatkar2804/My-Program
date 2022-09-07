package Inheritance;

public class Demo extends SingleLevel {
	
	int a= 100;
	String b = "Hey Shivam";
	
	
	public static void main(String[] args) {
		
		int a =30;
		char b = '$';
		SingleLevel s = new SingleLevel();
		Demo d = new Demo();
		
		
		d.Demo();
		System.out.println(d.a);
		System.out.println(a);
		System.out.println(b);
		System.out.println(s.a);
		
	}

}
