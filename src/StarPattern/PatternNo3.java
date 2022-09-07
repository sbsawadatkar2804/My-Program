package StarPattern;

public class PatternNo3 {
	
	public static void main(String[] args) {
		
		for(int a=1; a<=5; a++) {
			for(int b=5; b>=a; b--) {
				System.out.print("*");
			//	System.out.print();
			}
			System.out.println();
		}
	}

}
