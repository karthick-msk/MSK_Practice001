package commonUtils.msk;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stat.Stat;

import com.pojo.myss.MYS_001_Login_pojo;

import browser.common.BrowserCommon;


public class Utility {
	
	private static Utility utilInstance = null;

	private Utility() {

	}

	public static Utility getInstance() {
		if (utilInstance == null) {
			utilInstance = new Utility();
		}
		return utilInstance;
	}

	public void loadproperties() {

		Properties properties = new Properties();
		try {
			properties.load(getClass().getResourceAsStream("/stat.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Stat.APP_URL = properties.getProperty("APP_URL");
		Stat.BROWSER = properties.getProperty("BROWSER");
		Stat.UsernName = properties.getProperty("UsernName");
		Stat.Password = properties.getProperty("Password");
	}

	/*
	 * public static void login() {
	 * 
	 * BrowserCommon.getDriver().get(Stat.APP_URL);
	 * MYS_001_Login_pojo.getInstance().getHomepageemailfield().sendKeys(Stat.
	 * UsernName);
	 * MYS_001_Login_pojo.getInstance().getHomepagepasswordfield().sendKeys(Stat.
	 * Password); MYS_001_Login_pojo.getInstance().getHomepageloginbutton().click();
	 * 
	 * }
	 */
	public void initwebelement() {
		PageFactory.initElements(BrowserCommon.getDriver(), MYS_001_Login_pojo.getInstance());
//		PageFactory.initElements(BrowserCommon.getDriver(), HB_250_TENNIS_SB_BETS_pojo.getInstance());
	}

	public void takescreenshot() {
		File Screenshot = ((TakesScreenshot) BrowserCommon.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(Screenshot,
					new File("C:\\Karthickraja_MS\\Automation\\Demo\\SampleAutomation\\target\\Screenshot\\SSImg.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void highlightelement(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) BrowserCommon.getDriver();
		executor.executeScript("arguments[0].setAttribute('style','border: 3px solid blue');", element);
	}

	// Random strings

	public String randomeString(int stringcount) {
		String generatedString = RandomStringUtils.randomAlphabetic(stringcount);
		return (generatedString);
	}

	public String randomNumber(int numbercount) {
		String generatedString2 = RandomStringUtils.randomNumeric(numbercount);
		return (generatedString2);
	}

	public String randomAlphaNumber(int alphavalue, int numbervalue) {
		String st = RandomStringUtils.randomAlphabetic(alphavalue);
		String num = RandomStringUtils.randomNumeric(numbervalue);
		return (st + "@" + num);
	}

	public String randomAlphaNumberswspcase() {
		String st = RandomStringUtils.randomAlphabetic(4);
		String num = RandomStringUtils.randomNumeric(3);
		return (st + num);
	}

	public String randomNumberbelowtend() {
		String generatedString2 = RandomStringUtils.randomNumeric(1);
		return (generatedString2);
	}

	// Navigation forward backward refresh

	public static void navigationCommands(String options) {
		try {
			if (options.equalsIgnoreCase("back")) {
				BrowserCommon.getDriver().navigate().back();
			} else if (options.equalsIgnoreCase("forward")) {
				BrowserCommon.getDriver().navigate().forward();
			} else if (options.equalsIgnoreCase("refresh")) {
				BrowserCommon.getDriver().navigate().refresh();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void scrollUpandDownusingCoordinates(int top, int height) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) BrowserCommon.getDriver();
			js.executeScript("window.scrollBy(" + top + "," + height + ")");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();

		}
	}
	
	public static void getUrl(String url) throws Throwable {
		try {
			BrowserCommon.getDriver().get(url);
			BrowserCommon.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}
	public static void implicitlyWait(long time) throws Throwable {
		try {
			BrowserCommon.getDriver().manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	public static void assertequalsbase(WebElement element, String string) {
		try {
			Assert.assertEquals(element.getText(), string);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}	

}
