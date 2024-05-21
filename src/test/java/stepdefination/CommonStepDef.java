package stepdefination;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import browser.common.BrowserCommon;
import commonUtils.msk.Utility;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class CommonStepDef {
	//Launch browser
		public static WebDriver driver;
		private static final Logger LOGGER = LogManager.getLogger(CommonStepDef.class);

		@Before
		public void BeforeScenario() {
			LOGGER.info("Instantiation commonUtils");
			try {

				LOGGER.info("Loading the properties files");
				Utility.getInstance().loadproperties();
				LOGGER.info("Checkin the driver is null or not");
				if (driver == null) {
					LOGGER.info("driver is null.Instantiating it!");
					BrowserCommon.launchBrowser();
					Utility.getInstance().initwebelement();

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@AfterStep
		public void attchscreenshot(Scenario scenario) {
			if (scenario.isFailed()) {
				byte[] screenshottake = ((TakesScreenshot) BrowserCommon.getDriver())
						.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshottake, "image/png", "error screen");

			}
		}
		@After 
		public void teardown() {
			// TODO Auto-generated method stub
			BrowserCommon.getDriver().close();
			//if scenario pass final take page screeenshot
		}



}
