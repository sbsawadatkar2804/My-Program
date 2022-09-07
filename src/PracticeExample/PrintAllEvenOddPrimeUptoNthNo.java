package PracticeExample;

import java.util.Scanner;

public class PrintAllEvenOddPrimeUptoNthNo {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Your Number");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// All Even No.
		
	/*	for(int i=0; i<=n; i=i+2) {
			
			System.out.println(i);
		}
				*/
		
		// All Odd Number
		
	/*	for(int i=1; i<=n; i=i+2) {
			System.out.println(i);
		}		*/
		
		
		// All Prime Number
		
	for(int i=1; i<=n; i++) {			// Divisible By 1 And Itself Called Prime Number
		
		int count=0;
		
		for(int j=1;j<=i; j++) {
			
			if(i%j==0) {
				
				count++;
			}
		}
		if(count==2) {
			
			System.out.print(i+ "  ");
	
			}
		}	
		
	}
 }


