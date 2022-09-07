package PracticeExample;

import java.util.Scanner;

public class LeapYearPrac {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Your Year");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a%4==0 && a%100!=0 || a%400==0) {
			
			System.out.println("It Is Leap Year");
			
		} 
		else 
		{
			System.out.println("Its Not Leap Year");
		}
	}

}
