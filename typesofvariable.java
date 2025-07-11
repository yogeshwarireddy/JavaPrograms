package variables;

public class typesofvariable {  // class 
	
	int a; // Instance variable will be declaring without using static keyword
	
	static int b; // Static variable has a Static keyword is used to declared static variable
	
	public static void main(String[] args) { // main method
		// Types of Variable
		
		int c; // Local Variable will be declared inside the main method or any method
		c=2;
		System.out.println("a is a Instance Variable");
		System.out.println("b is a static varaible as we have used static keyword");
		System.out.println(c + "c is a Local variable as we have declared inside the main method or any other medthod");
     	
	}

}
