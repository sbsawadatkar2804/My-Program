package PracticeExample;

import java.util.*;

public class Armstrong {
	
		public static void main(String[] args) {
			
				System.out.println("Enter Your Number");
				
				Scanner sc = new Scanner(System.in);
				
				int a = sc.nextInt();
				
				int rem;
				int sum=0;
				int temp=a;
				
				while (temp!=0) {
					
					rem = temp%10;
					sum = sum+(rem*rem*rem);
					temp=temp/10;
				}
				if(sum==a) {
					System.out.println("Its  Armstrong");
				}
				else {
					System.out.println("Its Not Armstrong");
				}
			
		}

}
