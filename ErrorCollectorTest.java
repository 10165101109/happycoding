package software_testing_homework_11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ErrorCollector;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

class ErrorCollectorTest {

	@Rule
	public ErrorCollector ec = new ErrorCollector();
	@Test
	public void execution_continue_after_first_fail() {
		ec.checkThat("a",equalTo("b"));
		ec.checkThat(1,equalTo(2));
	}
	@Test
	public void execution_stop_after_first_fail() {
		assertThat("a",equalTo("b"));
		ec.checkThat(1,equalTo(2));
	}

}
