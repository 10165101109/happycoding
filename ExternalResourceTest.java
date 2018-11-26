package software_testing_homework_11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExternalResource;
import org.junit.rules.TestName;

class ExternalResourceTest {

	Resource resource;
	@Rule
	public TestName name = new TestName();
	
	@Rule
	public ExternalResource rule = new ExternalResource() {
		
		@Override
		protected void before() throws Throwable{
			resource = new Resource();
			resource.open();
		}
		
		@Override
		protected void after(){
			resource.close();
			System.out.println("\n");
		}
	};
	
	@Test
	public void test_1() throws Exception{
		
	}

	@Test
	public void test_2() throws Exception{
		
	}
}
