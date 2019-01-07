package software_testing_homework_11;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.Timeout;

class TimeoutRuleTest {

	@Rule
	public Timeout globalTimeout = new Timeout(200,TimeUnit.MILLISECONDS);
	@Test
	public void Finite_Loop() throws InterruptedException{
		Thread.sleep(100);;
	}

	@Test
	public void Finite_Loop1() throws InterruptedException{
		Thread.sleep(300);;
	}
	
	@Test
	public void Finite_Loop2() throws InterruptedException{
		Thread.sleep(500);;
	}
}
