package runner;

import Steps.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ={"src/test/java/feature"}, glue ="Steps", monochrome = true, publish = true)

public class RunTest extends BaseClass{

}
