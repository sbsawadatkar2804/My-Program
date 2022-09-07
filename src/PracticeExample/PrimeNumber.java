package PracticeExample;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int n;
		
		System.out.println("Enter Your Number");
		
		Scanner sc = new Scanner(System.in);
		
		n= sc.nextInt();
		int count=0;
	for(int i=1;i<=n;i++) {
		
		if(n%i==0) {
			
			count++;
		}
	}
	if(count==2) {
		System.out.println("Given No is Prime Number");
	} 
	else {
		System.out.println("Given No is Not Prime Number");
	}
		
		
		}

	}

	



