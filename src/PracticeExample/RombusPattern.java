package PracticeExample;

import java.util.Scanner;

public class RombusPattern {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Your Number");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<=n; i++) {
			
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
