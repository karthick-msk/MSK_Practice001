package com.pojo.myss;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MYS_001_Login_pojo {
	private static MYS_001_Login_pojo LoginInstance;

	private MYS_001_Login_pojo() {

	}

	public static MYS_001_Login_pojo getInstance() {
		if (LoginInstance == null) {
			LoginInstance = new MYS_001_Login_pojo();
		}
		return LoginInstance;
	}

	@FindBy(xpath = "//input[@placeholder='Email/Username']")
	private WebElement homepageemailfield;

	public WebElement gethomepageemailfield() {
		return homepageemailfield;
	}

	@FindBy(xpath = "//input[@id='password']")
	private WebElement homepagepasswordfield;

	public WebElement gethomepagepasswordfield() {
		return homepagepasswordfield;
	}

	@FindBy(xpath = "//input[@id='submitLogForm']")
	private WebElement homepageloginbutton;

	public WebElement gethomepageloginbutton() {
		return homepageloginbutton;
	}

	@FindBy(xpath = "//span[normalize-space()='Join Now']")
	private WebElement JOINNOWBUTTON;

	@FindBy(xpath = "//input[@id='usr_name']")
	private WebElement joinnowusername;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement EMAILFIELD;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordfield;

	public WebElement getpasswordfield() {
		return passwordfield;
	}

	@FindBy(xpath = "//input[@id='phoneNumber']")
	private WebElement Phonenumberfield;

	public WebElement getPhonenumberfield() {
		return Phonenumberfield;
	}

	@FindBy(xpath = "//button[@id='register']")
	private WebElement registerbutton;

	public WebElement getregisterbutton() {
		return registerbutton;
	}

	@FindBy(xpath = "//div[@class='snackbar-container  snackbar-pos top-right']")
	private WebElement Joinnowwarningmessage;

	public WebElement getJoinnowwarningmessage() {
		return Joinnowwarningmessage;
	}

	public WebElement getJOINNOWBUTTON() {

		return JOINNOWBUTTON;
	}

	public WebElement getjoinnowusername() {
		return joinnowusername;
	}

	public WebElement getEMAILFIELD() {
		return EMAILFIELD;
	}


}
