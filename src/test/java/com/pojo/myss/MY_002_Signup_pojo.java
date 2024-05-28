package com.pojo.myss;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MY_002_Signup_pojo {

private static MY_002_Signup_pojo SignupInstance;
			
private MY_002_Signup_pojo() {
}
public static MY_002_Signup_pojo getInstance() {

	if (SignupInstance == null) {
		SignupInstance = new MY_002_Signup_pojo();
	}
	return SignupInstance;
}
@FindBy(xpath="//span[contains(text(),'Account')]")
private WebElement Account;
}
