package software_testing_homework_10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.hamcrest.*;


class test_assertThat {

	@Test
	void equalsTo_Matcher() throws Exception{
		int id = 123;
		assertThat(id,equalTo(123));
		
		double salary = 44444.77777777;
		assertThat(salary,equalTo(44444.77777777));
		
		String date = "today is";
		assertThat(date,equalTo("today is"));
		
		int[] button= {3,4,2};
		assertThat(button,equalTo(new int[] {3,4,2}));
		
		double[] average = {6.7,8.9};
		assertThat(average,equalTo(new double[] {6.7,8.9}));
		
		String[] number = {"one","two"};
		assertThat(number,equalTo(new String[] {"one","two"}));	
	}
	@Test
	void equalsTo_Matchers_array_content_same_while_index_are_not_same() throws Exception{
		
		int[] button= {3,4,2};
		assertThat(button,equalTo(new int[] {3,2,4}));
		
		double[] average = {6.7,8.9};
		assertThat(average,equalTo(new double[] {8.9,6.7}));
		
		String[] number = {"one","two"};
		assertThat(number,equalTo(new String[] {"two","one"}));	
	}
	
	@Test
	void not_Matchers_test_pass() throws Exception{
		
		int button= 3;
		assertThat(button,not(equalTo(4)));
	}
	
	@Test
	void not_Matchers_test_fail() throws Exception{
		
		int button= 3;
		assertThat(button,not(equalTo(3)));
	}
	@Test
	void verify_multiple_values() throws Exception{
		
		int button= 3;
		assertThat(button,either(equalTo(3)).or(equalTo(4)));
		assertThat(button,both(not(4)).and(not(5)));
		assertThat(button,anyOf(equalTo(1),equalTo(2),equalTo(3)));
		assertThat(button,not(anyOf(equalTo(1),equalTo(2),equalTo(4))));
		assertThat(button,not(allOf(equalTo(1),equalTo(2),equalTo(4),equalTo(3))));
	}
	@Test
	void verify_collection_values() throws Exception{
		
		List<Double> button= Arrays.asList(3.1,4.3,2.3);
		assertThat(button,hasItem(3.1));
		assertThat(button,hasItems(3.1,2.3));
		assertThat(button,not(hasItem(2.8)));
	}
	@Test
	void string_Matcher() throws Exception{
		String name = "ECNU";
		assertThat(name,startsWith("E"));
		assertThat(name,endsWith("NU"));
		assertThat(name,containsString("C"));
	}
	
	@Test
	@Ignore("Happy vocation")
	void This_test_is_intended_ignore_when_we_are_on_vocation() throws Exception{
		System.out.println("You should not see this message!");
	}
	
}
