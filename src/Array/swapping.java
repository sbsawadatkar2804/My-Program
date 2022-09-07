package Array;

public class swapping {
	
	public static void main(String[] args) {
		
	/*
	int ar[] = {10,20,30,40,50,60};
	
	for(int i = 0; i<ar.length; i++) {
		
		System.out.print(ar[i]+" ");
	}
	
	for(int i=0; i<(ar.length)/2; i++) {
		int z;
		z=ar[i];
		ar[i]= ar[(ar.length-1)-i];
		
		ar[(ar.length-1)-i]=z;
			
	}
	System.out.println();
	
	for(int i =0 ; i<ar.length; i++) {
		
		System.out.print(ar[i] + " ");
			}		*/
		
		
		int a [] = {10,52,65,125,658,974};
		
		for(int i=0;i<=a.length-1;i++) {
			
			System.out.print(a[i]+" ");
		}
		
		for(int i=0; i<(a.length)/2;i++) {
			
			int z = a[i];
			a[i] = a[(a.length-1)-i];
			
			a[(a.length-1)-i]=z;
		}
		
		System.out.println();
		
		for(int i=0; i<=a.length-1; i++) {
			
			System.out.print(a[i]+" ");
		}
		
		
	  }
	
}