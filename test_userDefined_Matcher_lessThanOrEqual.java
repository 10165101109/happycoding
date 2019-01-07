package software_testing_homework_10;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static software_testing_homework_10.LessThanOrEqual.lessThanOrEqual;
import static software_testing_homework_10.MoreThanOrEqual.moreThanOrEqual;

import org.junit.jupiter.api.Test;

class test_userDefined_Matcher_lessThanOrEqual {

	@Test
	void lessThanOrEqual_userDefined() throws Exception{
		int button =3;
		assertThat(button,lessThanOrEqual(4));
		assertThat(button,lessThanOrEqual(3));
		
		double profit = 999.66;
		assertThat(profit,lessThanOrEqual(999.66));
		assertThat(profit,lessThanOrEqual(999.86));
		
		String name = "ECNU";
		assertThat(name,lessThanOrEqual("ECNU"));
		assertThat(name,lessThanOrEqual("GN"));
	}

	@Test
	void compare_with_maximum_value() throws Exception{
		int actual_max = Integer.MAX_VALUE+1;
		assertThat(actual_max,lessThanOrEqual(Integer.MAX_VALUE));
	}

	@Test
	void compare_with_minimal_value() throws Exception{
		int actual_min = Integer.MIN_VALUE+1;
		assertThat(actual_min,lessThanOrEqual(Integer.MIN_VALUE));
	}
}
