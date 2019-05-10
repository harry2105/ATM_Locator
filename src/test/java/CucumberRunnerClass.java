import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
 features = {"resources/Features/ATMLocator_Automation.feature"},
        glue = {"classpath:"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:"},
        monochrome = true
)
public class  CucumberRunnerClass {

  
}
