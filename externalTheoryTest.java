package software_testing_homework_11;
//import 
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
@RunWith(Theories.class)
class externalTheoryTest {

	@Theory
	public void adds_numbers(
			@ParametersSuppliedBy(numberSupplier.class)Number num1,
			@ParametersSuppliedBy(numberSupplier.class)Number num2
			) {
		System.out.println("num1 + num2 = "+num1+"+"
				+num2+"="+num1+num2);
	}
	
	@Theory
	public void adds_numbers_test(
			@ParametersSuppliedBy(numberSupplier.class)Number num1,
			@ParametersSuppliedBy(numberSupplier.class)Number num2
			) {
		Adder anAdder = new Adder();
		double expectedSum = num1.doubleValue() + num2.doubleValue();
		double actualResult = (double)anAdder.add(num1,num2);
		Assert.assertEquals(expectedSum,actualResult,0.01);
	}
	
	@Theory
	public void add_String(
			@ParametersSuppliedBy(StringSupplier.class)String str1,
			@ParametersSuppliedBy(StringSupplier.class)String str2
			) {
		System.out.println("num1 + num2 = "+str1+"+"
				+str2+"="+str1+str2);
	}
	
	@Theory
	public void add_String_test(
			@ParametersSuppliedBy(StringSupplier.class)String str1,
			@ParametersSuppliedBy(StringSupplier.class)String str2
			) {
		Adder anAdder = new Adder();
		String expectedSum = str1 + str2;
		String actualResult = (String)anAdder.add(str1,str2);
		Assert.assertEquals(expectedSum,actualResult);
	}

}
