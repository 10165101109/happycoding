package software_testing_homework_11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.TestName;

class TestNameRuleTest {

	@Rule
	public TestName Name = new TestName();
	
	@Test
	public void test1() {
		assertEquals("test_1",Name.getMethodName());
	}

	@Test
	public void test2() {
		assertEquals("test_2",Name.getMethodName());
	}

}
