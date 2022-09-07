package PracticeExample;

public class SwapingwiththirdVeriable {
	
	public static void main(String[] args) {
		
		int a = 50;
		int b = 70;
		
		int temp;
		System.out.println("Before Swaping "+a+" "+b);
		
		temp=a+b;	//50+70=120
		b=temp-b;	//120-70=50
		a=temp-a;	//120-50=70
		
		System.out.println("After Swaping "+a+" "+b);
		
	}

}
