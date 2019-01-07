package software_testing_homework_10;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
@FixMethodOrder(MethodSorters.JVM)
class orderedTests_JVM {

	@Test
	void edit() throws Exception{
		System.out.println("Edit executed");
	}

	@Test
	void create() throws Exception{
		System.out.println("Create executed");
	}
	@Test
	void remove() throws Exception{
		System.out.println("Remove executed");
	}
}
