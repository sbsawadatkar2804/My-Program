package String;

public class Class {
	
	public static void main(String[] args) {
		
		String a = "ShivamPatil";
		String b = "SHIVAMPATIL";
		String c = "Patil";
		String d = "PATIL";
		
		System.out.println(a.charAt(5));
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		//System.out.println(a.toUpperCase(null));
		System.out.println(a.replace(a, c));
		System.out.println(a.replace(c, d));
	}

}
