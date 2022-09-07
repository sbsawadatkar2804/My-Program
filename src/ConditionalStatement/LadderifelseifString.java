package ConditionalStatement;

public class LadderifelseifString {
	
	public static void main(String[] args) {
		
		String ProjectDomain = "Telecom";
		
		if (ProjectDomain == "HelthCare") {
			System.out.println("Medical Work Related");
		}
		else if (ProjectDomain == "Banking") {
			System.out.println("Money Related Transaction Work");
			
		}
		else if (ProjectDomain == "Telecom") {
			System.out.println("Communication Related Work");
		}
		else if (ProjectDomain == "Booking Protal") {
			System.out.println("Work Related To Travelling Ticket");
		}
		else {
			System.out.println("Random Project Domain");
		}
	}

}
