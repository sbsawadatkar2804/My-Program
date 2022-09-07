package Array;

import java.util.Arrays;

public class DoWhileAssending {
	
	public static void main(String[] args) {
		
		int a[]= {10,70,60,100,50,60,70};
		
		int i = 0;
		Arrays.sort(a);
		do {
			System.out.println(a[i]);
			i++;
		}
		while(i<=a.length-1);
		
	}
	

}
