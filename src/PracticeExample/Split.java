package PracticeExample;

public class Split {
	
	public static void main(String[] args) {
		
		String a = "My Name Is Shivam";
		
		String[] b = a.split(" ");
		
		for(int i=0; i<b.length; i++) {
			
			System.out.println(b[i]);
		}
	}

}
