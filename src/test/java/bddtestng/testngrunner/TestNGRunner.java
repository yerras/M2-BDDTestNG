package bddtestng.testngrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"bddtestng/testngstepdef"},
        plugin = {"pretty", "html: target/bddHTMLOutput"}
)
public class TestNGRunner extends AbstractTestNGCucumberTests {

}