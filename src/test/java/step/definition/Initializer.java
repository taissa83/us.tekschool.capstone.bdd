package step.definition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.Utils;

public class Initializer extends Base {
	
	/*
	 * This class hosts two methods that will run before and after each scenario
	 * Cucumber has Hooks and we have BeforeHooks and AfterHooks
	 * Before Hooks executes a block of code before each scenario
	 * Aft@Beforeer Hooks executes a block of code after each scenario 
	 */
	@Before
    public void beforeHooks(Scenario scenario) {
        logger.info("Scenario " + scenario.getName() + " started");

        browser();
        openBrowser();
        Utils.verify = scenario;
    }

    @After
    public void afterHooks(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failed Test");
            tearDown();
            logger.info("Scenario " + scenario.getName() + " " + scenario.getStatus());
        } else {
            tearDown();
            logger.info("Scenario " + scenario.getName() + " " + scenario.getStatus());
        }
    }

}