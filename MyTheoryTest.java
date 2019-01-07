package software_testing_homework_11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
class MyTheoryTest {

	@DataPoint public static String Name = "Sun";
	@DataPoint public static String Mike = "Mike";
	@DataPoints public static char[] mid = new char[] {'A','B','C'};
	@Theory
	public void sanity(String firstName,String lastName)
	{
		System.out.println("Sanity check" + firstName +","+lastName);
	}
	@Theory
	public void sanity_fullName(String firstName,char middleName,String lastName)
	{
		System.out.println("Sanity check full name:" + firstName +","
	+ middleName + "," +lastName);
	}
}
