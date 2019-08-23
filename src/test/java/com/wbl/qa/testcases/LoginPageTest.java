package com.wbl.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wbl.qa.base.TestBase;
import com.wbl.qa.pages.HomePage;
import com.wbl.qa.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
public  LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

@BeforeMethod

public void setUp() throws IOException {
	initialization();
	loginPage=new LoginPage();
	
}

@Test(priority=1)
public void loginPageTitleTest() {
	String title=loginPage.validateLoginPageTitle();
	Assert.assertEquals(title," Amazon Sign-In");
}
@Test(priority=2)
public void amazonLogoImageTest() {
	 boolean flag=loginPage.validateAmazonLogo();

}

@Test(priority=3)
public void loginTest() throws IOException {
	homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
}
	
@AfterMethod
public void teardown() {
	driver.quit();
	
}
	
	
	

}
