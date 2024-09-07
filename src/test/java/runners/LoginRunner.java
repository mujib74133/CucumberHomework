package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		  strict = true,
    //  features = "src\\test\\resources\\features\\CodefiosLogin.feature",  
	    features = "src\\test\\resources\\features",  
	//  features = "classpath:features",  
	        glue = "steps", // this referring to the package which holds all the step definitions classes
   	    //  tags = "@LoginFeature",
	   //   tags = {"@LoginScenario1 or @LoginScenario2"},
   	   //   tags = {"@OtherLoginScenario1 or @LoginScenario2"},
   	   //   tags = "@LoginScenario1",
       //   tags = "@OtherLoginScenario3",
       //   tags = "@OtherLoginScenario3",
   	   //   tags = {"@Regression"},
   	   //   tags = {"@OtherLoginFeatureCombine"},
       //   tags = {"@OtherLoginFeature"},
   	        tags = {"@AddAccountScenario1"},
      monochrome = true,
		  dryRun = false,
		  plugin = {
		    "pretty",
		    "html:target/reports/cucumber.html",
		    "json:target/reports/cucumber.json" 		
		  }
		  
		)

public class LoginRunner {

}
