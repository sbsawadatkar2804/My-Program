package Array;

public class ReverseArrays {
	
	public static void main(String[] args) {
		
		int [] a = {10,50,100,150,200,250,300};
		
		for(int i=a.length-1; i>=0; i--) {
			
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0; i<=a.length-1;i++) {
			
			
			System.out.print(a[i]+" ");
		}
	}

}
