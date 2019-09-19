package com.wbl.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wbl.qa.base.TestBase;
import com.wbl.qa.pages.CredentialPage;
import com.wbl.qa.pages.HomePage;
import com.wbl.qa.pages.LoginPage;
import com.wbl.qa.util.TestUtil;

public class CredentialPageTest extends TestBase{
	
	
	private static final String Uid = null;
	LoginPage loginPage;
	HomePage homePage;
	CredentialPage cred;
    String SheetName=Uid;
	String un;
	String pwd;

	public CredentialPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod

	public void setUp() throws IOException {
		initialization();
		loginPage=new LoginPage();
		cred=new CredentialPage();
		
	}
	@DataProvider
	  public Object[][] getCredential() {
		  
		Object data [][]=TestUtil.getTestData(SheetName);
		return data;
	  }
	@Test(dataProvider="getCredential")
	   //@Test
	public void loginTest(String username,String password) throws IOException {
		//public void loginTest() throws IOException {
		//driver.switchTo().frame();
		loginPage.signInClick();
		
		//homePage= cred.login(prop.getProperty("username"),prop.getProperty("password"));
		homePage=cred.login(un, pwd);
	}
  
  
	@AfterMethod
	public void teardown() {
		//driver.quit();
		
	}

}
