package StarPattern;

public class PatternNo14 {
	public static void main(String[] args) {
	/*	
		for(int c=1; c<=5; c++) {
			for(int a=1;a<=c; a++) {
				System.out.print(" ");
			}
			for(int b=5; b>=c; b--) {
				System.out.print("*");
			}
			for(int d=4; d>=c; d--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int c=1; c<=4; c++) {
			for (int a=4; a>=c; a--) {
				System.out.print(" ");
			}
			for(int b=1; b<=c; b++) {
				System.out.print("*");
			}
			for(int d=0; d<=c; d++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		*/
		
		   for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print(" ");
			}
			for(int c=5; c>=a; c--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		   
		   for(int i=1; i<=5; i++) {
			   for(int j=4; j>=i; j--) {
				   System.out.print(" ");
			   }
			   for(int k=0; k<=i; k++) {
				   System.out.print("* ");
			   
			   }
			   System.out.println();
		   }
	
	

		}
}


