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

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	CredentialPage cred;

	protected HomePageTest() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod

	public void setUp() throws IOException {
		initialization();
		loginPage=new LoginPage();
		loginPage.signInClick();
		homePage=new HomePage();
		cred=new CredentialPage();
		homePage= cred.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	@Test
	public void HomePageTitleTest() {
		String homeTitle=homePage.verifyHomeageTitle();
		Assert.assertEquals( homeTitle,"Your Amazon.com","Home Page Title not matched");
	}
	@Test
	public void OrdersTest() throws IOException {
		homePage.orderClick();
		
		
	}
	
	@AfterMethod
	public void teardown() {
		//driver.quit();
		
	}
}
