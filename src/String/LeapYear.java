package String;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter An Year");
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if((year%4==0) && (year%100!=0) || (year%400==0)) {
			
			System.out.println("Specified Year Is Leap Year");
		}
		else {
			System.out.println("Specified Year Is Not Leap Year");
		}
	}

}
