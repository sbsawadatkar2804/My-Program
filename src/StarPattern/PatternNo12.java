package StarPattern;

public class PatternNo12 {

	public static void main(String[] args) {
	
	/*   int Star=5;
	
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=Star; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<=4) {
				Star--;
			}
			else {
				Star++;
			}
		}   */

		
			for(int a=1; a<=5; a++) {
				for(int b=5; b>=a; b--) {
					
					System.out.print("*");
				}
				System.out.println();
			}
			
			for(int a=2; a<=5; a++) {
				for (int b=1; b<=a; b++) {
					System.out.print("*");
				}
				System.out.println();
			}  
		
		
	}

}
