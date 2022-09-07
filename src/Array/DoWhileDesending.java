package Array;

import java.util.Arrays;

public class DoWhileDesending {
	public static void main(String[] args) {
		
		int  a[] = {105,50,670,70,100,500,365,15};
		
		Arrays.sort(a);
		int i =a.length-1;
		do {
			System.out.println(a[i]);
			i--;
		}
		while(i>=0);
	}

}
