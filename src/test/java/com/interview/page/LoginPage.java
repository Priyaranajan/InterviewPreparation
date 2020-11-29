package com.interview.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interview.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name = "uid")
	WebElement txtusername;

	@FindBy(name = "password")
	WebElement txtpassword;

	@FindBy(name = "btnLogin")
	WebElement btnLogin;

	public LoginPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public String loginToApp(String un, String pwd) {
		txtusername.sendKeys(un);
		txtpassword.sendKeys(pwd);
		btnLogin.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver.getTitle();
	}
}
