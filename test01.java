package software_testing_homework_10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;

import org.junit.jupiter.api.Test;

class test01 {

	@Test
	void assertTrue_and_assertFalse_samples() throws Exception{
		Assert.assertTrue(true);
		Assert.assertFalse(false);
	}
	@Test
	void assertNull_and_assertNotNull_samples() throws Exception{
		Object myObject = null;
		Assert.assertNull(myObject);
		myObject = new String("testing");
		Assert.assertNotNull(myObject);
	}
	@Test
	void assertEquals_Integer_samples() throws Exception{
		Integer i = new Integer("10");
		Integer j = new Integer("10");
		Assert.assertEquals(i,j);
		j = i;
		Assert.assertEquals(i,j);
	}
	@Test
	void assertEquals_Double_samples() throws Exception{
		Double i = new Double("5.999999999999999999");
		Double j = new Double("5.999999999999999999");
		Assert.assertEquals(i,j);
		j = i;
		Assert.assertEquals(i,j);
	}
	@Test
	void assertEquals_String_samples() throws Exception{
		String i = new String("test");
		String j = new String("test");
		Assert.assertEquals(i,j);
		j = i;
		Assert.assertEquals(i,j);
	}
	@Test
	void assertNotSame_samples() throws Exception{
		String i = new String("test");
		String j = new String("test");
		Assert.assertNotSame(i,j);
	}
	@Test
	void assertSame_samples() throws Exception{
		String i = new String("test");
		String j = i;
		Assert.assertSame(i,j);
	}
}
