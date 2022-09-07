package String;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		
		int check,sum = 0,rem;
		
		System.out.println("Entre Your Value");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
	
		check=a;
		
		while(check!=0) {
			
			rem = check%10;
			
			sum = sum+(rem*rem*rem);
			
			check=check/10;
			
		}
		if(sum==a) {
			System.out.println("Given Value Is Armstrong");
		}
		else {
			System.out.println("Given Value Is Not Armstrong");
		}
	}

}
