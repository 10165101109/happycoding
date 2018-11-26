package software_testing_homework_11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Test;

class CoverageMetricTest {
	private CoverageMetric cm;
	@Before
	public void init()
	{
		cm = new CoverageMetric();
	}

	@Category(CrazyTest.class)
	
	@Test
	public void op1_is_null_and_op2_is_null() {
		Integer op1 = null;
		Integer op2 = null;
		int ExpectedRlt = 0;
		int ActualRlt = cm.absSum(op1,op2);
		assertEquals(ExpectedRlt,ActualRlt);
	}
	

	@Category(SmartTests.class)
	@Test
	public void op1_isnot_null_and_op2_is_null() {
		Integer op1 = new Integer(10);
		Integer op2 = null;
		int ExpectedRlt = 10;
		int ActualRlt = cm.absSum(op1,op2);
		assertEquals(ExpectedRlt,ActualRlt);
	}

	@Test
	public void op1_isnot_null_and_op2_isnot_null() {
		Integer op1 = new Integer(10);
		Integer op2 = new Integer(20);
		int ExpectedRlt = 30;
		int ActualRlt = cm.absSum(op1,op2);
		assertEquals(ExpectedRlt,ActualRlt);
	}
}
