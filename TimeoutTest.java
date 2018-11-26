package software_testing_homework_11;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
//import org.junit.jupiter.api.Test;

class TimeoutTest {

	@Test(timeout=200)
	public void method_executes_timely() throws Exception{
		Thread.sleep(100);;
	}

	@Test(timeout=200)
	public void method_executes_too_long() throws Exception{
		Thread.sleep(10000);;
	}
}
