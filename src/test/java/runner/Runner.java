package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = {"definitons"},
		tags = "@EscenarioWeb1, @EscenarioWeb2, @EscenarioApi"
)
public class Runner {

}
