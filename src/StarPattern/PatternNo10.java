package StarPattern;

public class PatternNo10 {
	
	public static void main(String[] args) {
		
		for(int a=1; a<=5; a++) {
			
			for(int b=5; b>=a; b--) {
				System.out.print(" ");
			}
			for(int c=1; c<=5; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
