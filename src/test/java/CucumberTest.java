import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        plugin = { "pretty", "html:target/cucumber-reports",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml",
                "testng:target/cucumber_testng.xml"}
)
public class CucumberTest {
}
