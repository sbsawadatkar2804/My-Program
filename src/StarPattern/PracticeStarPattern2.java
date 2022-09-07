package StarPattern;

public class PracticeStarPattern2 {
	
	public static void main(String[] args) {		// Hollow Pyramid
		
		for(int a=1; a<=5; a++) {
			for(int b=4; b>=a; b--) {
				System.out.print(" ");
			}
			for(int c=1; c<=2*a-1; c++) {
				if(c==1 || c==2*a-1 || a==1 || a==5) {
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
