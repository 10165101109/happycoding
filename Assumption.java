package software_testing_homework_10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.Assume;
import org.junit.Assert;

class Assumption {

	boolean isSonarRunning = false;
	@Test
	void very_critical_test() throws Exception{
		isSonarRunning = true;
		Assume.assumeFalse(isSonarRunning);
		Assert.assertTrue(true);
	}

}
