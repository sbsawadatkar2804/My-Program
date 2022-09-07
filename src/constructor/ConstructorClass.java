package constructor;

public class ConstructorClass {
	
	/*   public void ConstructorExample() {
		
		System.out.println("Shivam Sawadatkar");
		
	}
	
	public static void main(String[] args) {
		
		ConstructorClass x = new ConstructorClass();
		
		x.ConstructorExample();  
	}     */
	  

		// user defined constructor
	
	ConstructorClass(){
		
	}
	
	int x;
	String y;
	
	public static void main(String[] args) {
		
		TestDemo TD = new TestDemo();
		
		//TestDemo TD = new TestDemo();
		
		TD.Addition();
		
		TD.Multiplication();
		
		TD.Work();
		
		System.out.println(TD.Boy);
		System.out.println(TD.Name);
		
		
		
		
	}
	
	
	
}
