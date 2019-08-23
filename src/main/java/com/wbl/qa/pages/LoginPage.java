package com.wbl.qa.pages;

import com.wbl.qa.base.TestBase;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  extends TestBase{

	
//Page Factory/Object Factory
	
 

@FindBy(name="email")
 WebElement email;
 

@FindBy(name="password")
WebElement password;

@FindBy(id="signInSubmit")
WebElement SignIn;

@FindBy(id="createAccountSubmit")
WebElement SignUp;

@FindBy(xpath="\"/html//input[@id='ap_email']\"")
WebElement image;
//Initializing the page Objects/Elements
public  LoginPage() throws IOException {
	PageFactory.initElements(driver, this);
}
 public  String validateLoginPageTitle() {
		return driver.getTitle();
	}
 
 public boolean validateAmazonLogo() {
	 return image.isDisplayed();
 }
  public HomePage login(String un,String pwd) throws IOException {
	  email.sendKeys(un);
	  password.sendKeys(pwd);
	  SignIn.click();
	  return new HomePage();
  }
 
 
}



