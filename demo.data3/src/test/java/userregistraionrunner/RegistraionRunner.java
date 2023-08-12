package userregistraionrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "data3.feature", glue= {"userregistrationsteps"})
public class RegistraionRunner   extends AbstractTestNGCucumberTests{
	
}
