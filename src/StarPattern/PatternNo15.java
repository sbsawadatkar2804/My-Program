package StarPattern;

public class PatternNo15 {
	
	public static void main(String[] args) {
		
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				if(b==1 || a==5 || a==b) {
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

