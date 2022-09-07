package StarPattern;

public class PatternNo14New {
	
	public static void main(String[] args) {
		
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print(" ");
			}
			for(int c=5; c>=a; c--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int a=1; a<=4; a++) {
			for(int b=3; b>=a; b--) {
				System.out.print(" ");
			}
			for(int c=0; c<=a; c++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
