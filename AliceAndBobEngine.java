
public class AliceAndBobEngine {
	
	String result;
	
	AliceAndBobEngine(){
		result = "";
	}
	
	//HINT: Look at the test to see what is expected for different conditions
	public String evaluateAliceOrBob(String input) {
		
		if (input.equals("Alice")) {
			return "Hello, Alice";
			
		} else if (input.equals("Bob")) {
			return "Hello, Bob";
			
		} else {
			return "I don't know you!";
		}
	}	
}
