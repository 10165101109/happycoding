package software_testing_homework_11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Verifier;

class VerfierRuleTest {

	private String errorMsg = null;
	@Rule
	public TestRule tr = new Verifier() {
		protected void verify() {
			Assert.assertNull("errorMsg should be null after each test execution",errorMsg);
		}
	};
	
	@Test
	public void verifier_fail() throws Exception{
		errorMsg = "Giving a value";
	}

	@Test
	public void verifier_pass() throws Exception{
		
	}
}
