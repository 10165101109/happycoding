package software_testing_homework_11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Categories.class)
@IncludeCategory(CrazyTest.class)
@SuiteClasses({CoverageMetricTest.class})
class CrazyTestSuite {


}
