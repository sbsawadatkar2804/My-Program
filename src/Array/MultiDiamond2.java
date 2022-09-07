package Array;

public class MultiDiamond2 {
	
	public static void main(String[] args) {
		
		int ar [][] = {{10,20,30,40},{50,60,70,80}};		// 10,20,30,40
														   //  50,60,70,80
		
		int a = ar[1].length-1;
		
		for(int i = 0; i<=1; i++) {				// Row = i<=1		 index is Selected
			
			for(int j =0; j<=3; j++) {			// Column = j<=3     index is Selected
				
				System.out.print(ar [i][j] + " ");
				
				}
			
				System.out.println();
				//System.out.println(a);
			//	System.out.println(ar[1][3]);
				
			}
	}
}
