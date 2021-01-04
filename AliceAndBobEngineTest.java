import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

class AliceAndBobEngineTest {

	public AliceBobEngineTest() {
		
	}
	
	@Before 
	public void setup() {
		
	}
	
	@After
	public void tearDown() {
		
	}
	
	@Test
	void evaluateAliceOrBobTestAlice() {
		AliceAndBobEngine aliceAndBobEngineTest = new AliceAndBobEngine();
		
		assertEquals("Hello, Alice", aliceAndBobEngineTest.evaluateAliceOrBob("Alice"));
		assertNotEquals("Hello, Alice", aliceAndBobEngineTest.evaluateAliceOrBob("You are reaching the wrong person"));
		
		assertEquals("I don't know you!", aliceAndBobEngineTest.evaluateAliceOrBob("Alicia"));
		assertNotEquals("I don't know you!", aliceAndBobEngineTest.evaluateAliceOrBob("Alice"));
	}
	
	

}
