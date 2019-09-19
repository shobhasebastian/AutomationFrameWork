package com.wbl.qa.pages;

import com.wbl.qa.base.TestBase;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  extends TestBase{

	
//Page Factory/Object Factory
	
 

@FindBy(id="ap_email")
 WebElement email;


@FindBy(id="ap-credential-autofill-hint")
WebElement password;

@FindBy(id="nav-link-accountList")
WebElement SignIn;

@FindBy(id="continue")
WebElement cont;

@FindBy(id="signInSubmit")
WebElement SignIn2;

@FindBy(id="createAccountSubmit")
WebElement SignUp;

@FindBy(xpath="\"//div[@id='nav-logo']/a/span[1]\"")
WebElement image;
//@FindBy()
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
  
 public void signInClick() {
	 SignIn.click();
	 
 }
 /*public void contClick() {
	 cont.click();
	 
 }
 public void signIn2Click() {
	 SignIn2.click();
	 
 }*/
 
 /*public HomePage login(String un,String pwd) throws IOException {
 email.sendKeys(un);
 contClick();
 password.sendKeys(pwd);
 signIn2Click();
 return new HomePage();
}*/
}



