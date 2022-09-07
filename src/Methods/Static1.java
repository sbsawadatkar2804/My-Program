package Methods;

public class Static1 {
	
	static int a=20;    	// Static Variable
	
	public static void main(String[] args) {
		
		Static1 x = new Static1();
		Static1 x1 = new Static1();
		Static1 x2 = new Static1();
		System.out.println(x.a);
		System.out.println(x1.a);
		System.out.println(x2.a);
		x2.a = 90;
		System.out.println(x2.a);
		System.out.println(x1.a);
		System.out.println(x.a);
	}
	
}
