package Array;

public class ReverArrayPractice {
	
	public static void main(String[] args) {
		
		int a [] = {10,52,65,125,658,974};
		
		for(int i=0; i<=a.length-1; i++) {
			System.out.print(a[i]+"  ");
		}
		
		System.out.println();
		
		for(int i=a.length-1;i>=0;i--) {
			
			System.out.print(a[i]+"  ");
		}
	
		
	
	}

}
