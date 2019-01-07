package software_testing_homework_11;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
//import org.hamcrest.Description;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.MethodSorters;
import org.junit.runners.model.Statement;
import org.junit.Before;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestWatcherRuleTest {

	private static String dog = "";
	@Rule
	public TestWatcher watcherman = new TestWatcher() {
		@Override
		public Statement apply(Statement base,Description description)
		{
			return super.apply(base, description);
		}
		
		protected void succedded(Description description)
		{
			dog+=description.getDisplayName()+" "+"success!\n";
		}
		@Override
		protected void failed(Throwable e,Description description)
		{
			dog+=description.getDisplayName()+" "+ e.getClass().getSimpleName()+"\n";
		}
		@Override
		protected void starting(Description description)
		{
			super.starting(description);
		}
		@Override
		protected void finished(Description description)
		{
			super.finished(description);
		}
	};
	
	@Test
	public void red_test() {
		fail();
	}
	
	public void green() {}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println(dog);
	}

}
