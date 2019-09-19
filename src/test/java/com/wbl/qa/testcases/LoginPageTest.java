package com.wbl.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wbl.qa.base.TestBase;
import com.wbl.qa.pages.CredentialPage;
import com.wbl.qa.pages.HomePage;
import com.wbl.qa.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	CredentialPage cred;
	
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
	Assert.assertEquals(title,"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
}
/*@Test(priority=2)
public void amazonLogoImageTest() {
	 boolean flag=loginPage.validateAmazonLogo();

}*/

@Test(priority=3)
public void SigninTest() throws IOException {
	loginPage.signInClick();
	
}

/*@Test()
public void loginTest() throws IOException {
	//driver.switchTo().frame();
	homePage= cred.login(prop.getProperty("username"),prop.getProperty("password"));
}*/

@AfterMethod
public void teardown() {
	//driver.quit();
	
}
	
	
	

}
