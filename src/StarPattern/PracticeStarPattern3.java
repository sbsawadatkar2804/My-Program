package StarPattern;

public class PracticeStarPattern3 {				// Inverted Hollow Pattern
	
	public static void main(String[] args) {
		
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print(" ");
			}
			for(int c=9; c>=2*a-1; c--) {
				if(c==9 || c==2*a-1 || a==1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
