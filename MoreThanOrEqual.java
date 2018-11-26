package software_testing_homework_10;
import org.hamcrest.*;
import org.junit.Before;
import org.junit.Test;
public class MoreThanOrEqual<T extends Comparable<T>> extends BaseMatcher<Comparable<T>> {
	private final Comparable<T> expectedValue;
	public MoreThanOrEqual(T expectedValue) {
		this.expectedValue = expectedValue;
	}
	@Override
	public void describeTo(Description description) {
		description.appendText("more than or equal (>=)" + expectedValue);
	}
	@Override
	public boolean matches(Object t) {
		int compareTo = expectedValue.compareTo((T)t);
		return compareTo < 1;
	}
	@Factory
	public static<T extends Comparable<T>> Matcher<T> moreThanOrEqual(T t){
		return new MoreThanOrEqual(t);
	}
}
