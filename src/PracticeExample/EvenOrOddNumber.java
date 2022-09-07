package PracticeExample;

import java.util.Scanner;

public class EvenOrOddNumber {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Your Number");
		
		Scanner sc = new Scanner(System.in);
		
		int	n = sc.nextInt();	
		
			if(n%2==0) {
				System.out.println(n+" :-Its Even Number");
			}
			else {
				System.out.println(n+" :-Its Odd Number");
			}
		}
		
	}


