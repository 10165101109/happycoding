package software_testing_homework_11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.rules.*;
import org.junit.Rule;

class ExpectedExceptionRuleTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void throwsNothing() {

	}

	@Test
	public void throwsNullPointerException()
	{
		thrown.expect(NullPointerException.class);
		throw new NullPointerException();
	}
	
	@Test
	public void throws_IllegalStateException_withMessage()
	{
		thrown.expect(IllegalStateException.class);
		thrown.expectMessage("Is this a legal state?");
		throw new IllegalStateException("Is this a legal state?");
	}
}
