package newassignment;

public class MethodOverriding_ClassC{

//Below given is the written explanation of why the diamond problem arises in java with respect to classes.


	// below given code is just an assumption to explain the diamond problem
	//this code won't compile

// public class MethodOverriding_ClassC extends MethodOverriding_ClassA, MethodOverriding_ClassB{
	
	public void test(){
		//calling super class method
		//method2(int [] ints);
		
		
		// Notice that test() method is making a call to superclass method2() method. 
				// This leads to the ambiguity as the compiler doesn’t know which superclass method to execute. 
				// Because of the diamond-shaped class diagram, it’s referred to as Diamond Problem in java. 
				// The diamond problem in Java is the main reason java doesn’t support multiple inheritances in classes. 
				// Notice that the above problem with multiple class inheritance can also come with only three classes where all of them has at least one common method.
		
	}

}
