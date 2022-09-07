package Inheritance;

public class MultiLevel {
	
	void Shivam(){
		int a=500;
		String b = "Get From Your Dad";
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		MultiLevel m = new MultiLevel();
		Demo d = new Demo();
		
		/*m.Demo();
		System.out.println(m.a);
		System.out.println(m.b);  */
		
		d.Demo();
		System.out.println(d.a);
		System.out.println(d.b);
		m.Shivam();
	}

}

