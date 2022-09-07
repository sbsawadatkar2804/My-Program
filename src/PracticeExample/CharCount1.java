package PracticeExample;

public class CharCount1 {
	
	public static void main(String[] args) {
		
		String a = "Velocity Is Best FoEr Testing";
		int Count = 0;
		for(int i =a.length()-1; i>=0;i--) {
			
			char b = a.charAt(i);
			
			if(b =='E') {
				Count++;
			}
			
			}

		System.out.println(Count);
	}

}
