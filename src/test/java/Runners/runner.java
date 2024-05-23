package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"Steps"},
//        tags = "@Sanity",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        publish = true
)
public class runner extends AbstractTestNGCucumberTests {
}
