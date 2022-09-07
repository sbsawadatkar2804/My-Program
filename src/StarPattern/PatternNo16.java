package StarPattern;

public class PatternNo16 {
	public static void main(String[] args) {
		
		for(int a=1; a<=5; a++) {
			for(int b=5; b>=a; b--) {
				if(b==5 || a==1 || a==b) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
}
	
	


