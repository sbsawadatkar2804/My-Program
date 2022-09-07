package StarPattern;

public class PracticeStarPattern {
	
	public static void main(String[] args) {		//Hallow Diamond
		
		for(int i=1; i<=5; i++) {
			for(int k=4; k>=i; k--) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				if(j==1 || j==2*i-1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			
			}
			System.out.println();
		}
		for(int a=1; a<=4; a++) {
			for(int b=1; b<=a; b++) { 
				System.out.print(" ");
			}
			for(int c=7; c>=2*a-1; c--) {
				
				if(c==7 || c==2*a-1) {
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
