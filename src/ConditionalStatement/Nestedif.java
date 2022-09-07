package ConditionalStatement;

public class Nestedif {
	
	public static void main(String[] args) {
		
		String UN = "ABC";
		String PWD = "XYZ";
		
		if (UN == "ABC") {
			System.out.println("Username Valid");
			
			if (PWD == "XYZ") {
				System.out.println("Password Valid");
				System.out.println("Log in Successful");
			}
		else {
			System.out.println("Password Invalid");
			System.out.println("Log In Fail");
		}
	}
		else {
			System.out.println("Invalid Usename");
			System.out.println("Login Fail");
		}
}
}
