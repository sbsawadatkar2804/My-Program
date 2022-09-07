package AbstarctClass;

public abstract class A {
	// Abstract class is nothing but the incomplete class contain complete as well as incomplete method
	int a = 10;
	String b= "Shivam";
	char  c = '@';
	
	public void display() {
		System.out.println("Running Display Method");
	}
	public abstract void show();
	
	public abstract void blank();
	
	public static void main(String[] args) {
		
		// A x = new A();
		
	}

}
