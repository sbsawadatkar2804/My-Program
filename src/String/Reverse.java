package String;

public class Reverse {
	
	public static void main(String[] args) {
		
		// Reverse Method Of String
		
		String a = "Velocity";
		String rev = "";
		
		for(int i = a.length()-1; i>=0; i--) {
			
			 rev = rev + a.charAt(i);
			 
		}
		System.out.print(rev);
		System.out.println();
	}

}
