package StarPattern;

public class PatternNo {
	
	public static void main(String[] args) {
		
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		for(int a=1; a<=4; a++) {
			for(int b=4; b>=a; b--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
