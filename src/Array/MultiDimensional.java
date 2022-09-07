package Array;

public class MultiDimensional {
	
	public static void main(String[] args) {
		
	
	int ar[][] = new int [2][4];    // Here Compiler Pick up Length		// 10 20 50 70
									                                   //  30 40 60 80
	
	ar [0][0] = 10;
	ar [0][1] = 20;
	ar [1][0] = 30;
	ar [1][1] = 40;
	ar [0][2] = 50;
	ar [1][2] = 60;
	ar [0][3] = 70;
	ar [1][3] = 80;
	
	
	//System.out.println(ar[0][0]);
	
	for(int i = 0; i<=1; i++) {				//Here Compiler Pick up Index
		for(int j =0; j<=3; j++) {
			System.out.print(ar [i][j] + " ");
		}
		System.out.println();
	}
	
	
	}
	
}
