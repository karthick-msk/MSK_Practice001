package com.pojo.myss;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

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

	@FindBy(xpath="//span[contains(text(),'Account')]")
	private WebElement Account;
	
	@FindBy(xpath="(//a[@href='https://myshopings.in/login'])[2]")
	private WebElement loginAccount;
	
	@FindAll({
		@FindBy(id="txt-email"),
		@FindBy(xpath="(//input[@name='email'])[1]")})
	private WebElement homepageemailfield;

	
	@FindBys({
		@FindBy(xpath = "//input[@id='txt-password']"),
//		@FindBy(id = "txt-password")
				})
	private WebElement homepagepasswordfield;

	
	@FindBy(xpath = "//button[contains(text(), 'Login')]")
	private WebElement homepageloginbutton;

		
	@FindBy(xpath = "//a[contains(text(), 'Create one')]")
	private WebElement createOne;
	
	@FindBy(xpath="//span[contains(text(),'johnwhite')]")
	private WebElement accountVerify;

	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement loginToaster;
	
	

	public WebElement getAccount() {
		return Account;
	}
	public WebElement getloginAccount() {
		return loginAccount;
	}
	public WebElement getHomepageemailfield() {
		return homepageemailfield;
	}
	

	public WebElement getHomepagepasswordfield() {
		return homepagepasswordfield;
	}

	public WebElement getHomepageloginbutton() {
		return homepageloginbutton;
	}

	public WebElement getCreateOne() {
		return createOne;
	}
	public WebElement getaccountVerify() {
		return accountVerify;
	}
	public WebElement getloginToaster() {
		return loginToaster;
	}




}
