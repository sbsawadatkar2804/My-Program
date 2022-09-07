package Array;

import java.util.Arrays;

public class SingleDimensional {

	public static void main(String[] args) {		// 
		
		int ar [] = {10,20,30,40,50,20,10};
		
		System.out.println("-----Original Info From Array-----");
		
		for(int i = 0; i<=ar.length-1; i++) {
			
			System.out.println(ar[i]);
		}
		
		 Arrays.sort(ar);		// Its Important
		
		System.out.println("-----Array In Assending Order-----");
		
		for(int i =0; i<=ar.length-1; i++) {
			
			System.out.println(ar[i]);
			
		}
		System.out.println("-----Array In Dessending Order-----");
		
		for(int i = ar.length-1; i>=0; i--) {
			
			System.out.println(ar[i]);
		}
	}
}
