package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature/SwagLabs_Testing.feature",
        glue = "StapDefination_Swaglabs"
)
public class Swaglabs_Runner {
}
