package com.interview.pagetest;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.interview.base.TestBase;
import com.interview.page.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;

	@Parameters("browser")
	@Test
	public void verifyLogin(String browser) {
		init(browser);
		loginPage = new LoginPage();
		String actualTitle = loginPage.loginToApp("mngr297082", "UsedegE");
		String expectedTitle = "GTPL Bank Manager HomePage";
		System.out.println(driver.getTitle());
		Assert.assertEquals(expectedTitle, actualTitle);

	}

}
