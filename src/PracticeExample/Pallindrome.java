package PracticeExample;

import java.util.Scanner;

public class Pallindrome {
	
	public static void main(String[] args) {
		
		//System.out.println("Enter Your Value");
		
		//Scanner sc = new Scanner(System.in);
		
		//int s = sc.nextInt();
		String  a = "Madam";
		String rev = "";
		
		for(int i=a.length()-1;i>=0;i--) {
			
			rev = rev+ a.charAt(i);
			
		}
		System.out.println(rev);
		
		if(a.equalsIgnoreCase(rev)) {
			System.out.println("Its Pallindrom");
		}else {
			System.out.println("its Not Pallindrom");
		}
	}

}
