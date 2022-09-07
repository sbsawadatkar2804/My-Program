package Array;

import java.util.Arrays;

public class ForAssendingDesending {
	
	public static void main(String[] args) {
		
		int a [] = {20,54,26,89,15,45};
		
		System.out.println("Original Values");
		
		for(int i = 0; i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();
		
		Arrays.sort(a);
		
		System.out.println("Assending Order");
		
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		
		System.out.println();
		
		System.out.println("Desending Order");
		

		
		for(int i=a.length-1; i>=0;i--) {
			System.out.print(a[i]+",");
		}
	}

}
