package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/validateDemoQa.feature",
		glue = {"Definitons"},
		tags = "@Escenario2"
)
public class runner {

}
