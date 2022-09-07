package Expectionhandlling;

public class TryCatch {
	
	public static void main(String[] args) {
		
		int a = 50;
		int b = 0;
		int c=0;
		int [] d = {10,20,60,80,90};
		
		System.out.println("Start");
		
		try {
		 c = a/b;		//	Risky Code
		
		}
		catch (ArithmeticException e) {
		b=2;
		c=a/b;			// Alternative Code
		System.out.println(c);
		}
		
		try {
			 System.out.println(d[9]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Array Index Out Of Bound");
			System.out.println(d[3]);
		}
		

	
	}

}
