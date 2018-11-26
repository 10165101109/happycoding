package software_testing_homework_10;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;

@RunWith(Suite.class)
@Suite.SuiteClasses({test01.class,OrderedTests_omitted.class})
class RunTestWithRunner {

}
