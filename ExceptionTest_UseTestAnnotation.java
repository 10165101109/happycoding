package software_testing_homework_11;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
//import org.junit.jupiter.api.Test;

class ExceptionTest_UseTestAnnotation {

	
	@Test(expected = IndexOutOfBoundsException.class)
	public void test_tryExceptionTest_throw_unexpected_Exception() {
		new ArrayList<Object>().get(1);
	}
	
	
}
