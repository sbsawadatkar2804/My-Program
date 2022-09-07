package Array;

public class HighestNoInArrays {
	
	public static void main(String[] args) {
		
		int[] a  = {10,50,40,80,125};
		
		int b = a[0];
		
		for(int i=0; i<=a.length-1;i++) {
			
			if(a[i]>b) {
				
				b=a[i];
			}
			
		}
		System.out.println(b);  			
		
		
	
		
	}

}