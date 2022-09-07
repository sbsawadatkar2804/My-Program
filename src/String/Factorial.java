package String;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
	/*	int a = 5;		// Factorial Method Of String
		
		int fact = 1;
		
		for(int i = 1; i<=5; i++) {
			
			fact = fact * i;
	
		}
		System.out.println(fact);  */
		
		System.out.println("ENTER YOUR VALUE");
		
		Scanner sc  = new Scanner(System.in);
		
		int a  = sc.nextInt();
		
		int fact = 1;
		
		for(int i=1; i<=a; i++) {
			
			fact = fact* i;
		}
		System.out.println(fact);
		
	}

}
