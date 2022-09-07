package StarPattern;

public class PatternNo7 {
	
	public static void main(String[] args) {
		
		/* int Space = 4;
		 int Star = 1;
		
			for(int i =1; i<=9; i++) {
				
				for(int j=1; j<=Space; j++) {
					System.out.print(" ");
				}
				for(int j = 1; j<=Star; j++) {
					System.out.print("*");
				}
				System.out.println();
				 
				if(i<=4) {
					Space--;
					Star= Star+2;
				}
				else {
					Space++;
					Star= Star-2;
				}
					
			}*/
		
		
		for(int a=1; a<=5; a++) {
			for(int b=4; b>=a; b--) {
				System.out.print(" ");
			}
			for(int c=1; c<=a; c++) {
				System.out.print("*");
			}
			for(int j=2; j<=a; j++) {
				System.out.print("*");
			
		}
			System.out.println();
		
		}
			  for(int a=1; a<=4; a++) {
				for(int b=1; b<=a; b++) {
					System.out.print(" ");
				}
				for(int c=4; c>=a; c--) {
					System.out.print("*");
				}
				for(int j=3; j>=a; j--) {
					System.out.print("*");
				}
				System.out.println();
			}

}
}
