package software_testing_homework_10;
import software_testing_homework_10.square;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)

class ParameterizedTest {

	private int number;
	private int expectedResult;
	
	@Parameters
	public static Collection<Object[]> squareData(){
		return Arrays.asList(new Object[][] {{0,0},{1,1},{3,9},{7,49}});
	}
	
	public ParameterizedTest(int input,int expected) {
		number = input;
		expectedResult = expected;
	}
	@Test
	void This_is_a_parameterized_test() throws Exception{
		square s = new square();
		Assert.assertEquals(s.square_of(number), expectedResult);
	}

}
