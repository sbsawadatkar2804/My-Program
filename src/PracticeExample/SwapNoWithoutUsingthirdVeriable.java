package PracticeExample;

public class SwapNoWithoutUsingthirdVeriable {
	
	public static void main(String[] args) {
		
		int a = 20;
		int b = 60;
		
		System.out.println("Before Swaping "+a+" "+b);
		
		a=a+b;  // 20+60=80
		b=a-b;	//80-60=20
		a=a-b;	//80-20=60
		
		System.out.println("After Swaping "+a+" "+b);
		
	}

}
