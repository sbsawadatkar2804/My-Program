package PracticeExample;

public class CountUpperNdLowerChar {
	
	public static void main(String[] args) {
		
		String str = "Velocity Is The Best For TEsting";
		
				int Upper = 0;
				
				int Lower = 0;
				
				for(int i =str.length()-1; i>=0;i--) {
					
				char ch = str.charAt(i);
				
					if(ch>='A' && ch<='Z') {
						
						Upper++;
					}
					else if (ch>='a' && ch<='z') {
						
						Lower++;
					}
					else {
						continue;
					}
				}
			//	System.out.println(str.toLowerCase());
		System.out.println("Upper Charecter in String is = " + Upper + " " + "Lower Charecter in String is = " + Lower);
	}

}
