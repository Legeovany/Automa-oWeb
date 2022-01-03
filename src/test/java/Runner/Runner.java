package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features   ="src/test/java/Feature/",
		glue       = {""},
		tags       = "@CT003",
		monochrome = true, 
		dryRun     = false)


public class Runner {
	
}                                                                       