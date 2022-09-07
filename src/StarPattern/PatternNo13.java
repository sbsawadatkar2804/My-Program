package StarPattern;

public class PatternNo13 {
	
	public static void main(String[] args) {
		
		/*   int Star =5;
		int Space= 0;
		
		for(int i=1; i<=9; i++) {
			for(int j= 1; j<=Space; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=Star; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			if (i<=4) {
				Space++;
			    Star--;
			}
			else {
				Space--;
				Star++;
			}
		}  */    
		
		
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print(" ");
			}
			for(int c=5; c>=a; c--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++ ) {
			for(int j=4; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
