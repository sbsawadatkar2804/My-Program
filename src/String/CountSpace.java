package String;

public class CountSpace {
	
	public static void main(String[] args) {		// Count Space Method Of String
		
		String a = "Velocity Is The Best For Tester Training";
	
		int count = 0;
		
		for(int i =0; i<=a.length()-1; i++) {
			
			char b = a.charAt(i);
			
			if(b == ' ') {
				
				count++;
			}
		}
			System.out.println(count);
		}
		
	}


