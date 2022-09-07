package Operators;

public class LogicalOperator {
	
	public static void main(String[] args) {
		 
		// && Operator (And)
		
		int a = 15, b = 100;
		
		 System.out.println((a<b) && (a>b));
		 
		 System.out.println((a>b) && (a<b));
		 
		 // || Operator (OR)
		 
		 System.out.println((a>b) || (a<b));
		 
		 System.out.println((a>b) || (a<b));
		 
		 // ! Operator (not)
		 
		 System.out.println(!(a==b));
		 
		 System.out.println(!(a<b));
	}

}
