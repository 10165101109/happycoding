package software_testing_homework_10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.*;
import static org.junit.Assert.assertThat;
import static software_testing_homework_10.MoreThanOrEqual.moreThanOrEqual;

class test_userDefined_Matcher {

	@Test
	void moreThanOrEqual_userDefined() throws Exception{
		int button =3;
		assertThat(button,moreThanOrEqual(2));
		assertThat(button,moreThanOrEqual(3));
		
		double profit = 999.66;
		assertThat(profit,moreThanOrEqual(999.66));
		assertThat(profit,moreThanOrEqual(999.56));
		
		String name = "ECNU";
		assertThat(name,moreThanOrEqual("ECNU"));
		assertThat(name,moreThanOrEqual("CN"));
	}

}
