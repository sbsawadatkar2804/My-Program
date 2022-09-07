package Array;

public class FindDuplicateNoFromArrays {
	
	public static void main(String[] args) {
		
		int a [] = {10,20,25,30,20,65,30,95,14};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1; j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println(a[i]);
				}
			}
			
		}  
		
		
	
	}
}

