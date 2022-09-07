package String;

public class Pallindrome {
	
	public static void main(String[] args) {
		
		// Pallindrome Method Of String
		
		String a = "MADAM";
		String rev = "";
		
		for(int i = a.length()-1; i>=0; i--) {
			
			rev = rev + a.charAt(i);
			
		}
		//System.out.println(rev);
		
		if(a.equals(rev)) {
			
			System.out.println("Its Pallindrome");
		}
		else {
			System.out.println("Its not Pallindrome");
		}
	}

}
