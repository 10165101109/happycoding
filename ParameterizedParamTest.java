package software_testing_homework_10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
class ParameterizedParamTest {

	@Parameter(value=0)
	public int number;
	
	@Parameter(value=1)
	public int expectedResult;
	
	@Parameters(name="{index}:square_of({0})= {0}")
	public static Collection<Object[]> squareData(){
		return Arrays.asList(new Object[][] {{0,0},{1,1},{3,9},{7,49}});
	}
	
	@Test
	void square_of() throws Exception{
		square s = new square();
		Assert.assertEquals(s.square_of(number), expectedResult);
	}

}
