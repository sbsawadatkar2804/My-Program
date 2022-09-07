package PracticeExample;

public class Fibonacy {
	
	public static void main(String[] args) {
		
		
		// Fabonancy Series...
		
		int a =0;
		
		int b =1;
		
		System.out.print(a+" "+b);
		
		for(int i=0; i<=10; i++) {
		
			int c = a+b;
			
			System.out.print(" "+c);
			
			a=b;		// Here b=1
			b=c;		// Here b=1
		}

	}

}
