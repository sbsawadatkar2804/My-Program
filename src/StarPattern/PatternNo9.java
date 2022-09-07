package StarPattern;

public class PatternNo9 {
	
	public static void main(String[] args) {
	
	for(int a=1; a<=5; a++) {
		for(int b=4; b>=a; b--) {
			System.out.print(" ");
		}
		for(int c=1; c<=a; c++){
			System.out.print("*");
		}
		System.out.println();
	}
	
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print(" ");
		}
		for(int k=4; k>=i; k--) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	}
}
