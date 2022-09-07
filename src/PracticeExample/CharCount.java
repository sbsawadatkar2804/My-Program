

package PracticeExample;

public class CharCount {
	
	public static void main(String[] args) {
		
		// Count  Each Charecter Exected Space
		
		String a = "Hey welcome to Veloicity";
		
		
		int count = 0;
		
		for(int i = 0;i<a.length();i++) {
			
			
			if(a.charAt(i)!= ' ') {
				
				
				count++;
			}
			
		}
		System.out.println(count++);
	}

}
