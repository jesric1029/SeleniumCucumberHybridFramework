import core.SeleniumCore;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resource"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome=true
)
public class RunTests {
    @BeforeClass
    //Currently only methods to run with Chrome but possibility there to run with other browers if needed.
    public static void beforeRunning(){
        SeleniumCore.setDriver("Chrome");
    }

    @AfterClass
    public static void afterRunning(){
        SeleniumCore.driverCleanup();
    }


}
