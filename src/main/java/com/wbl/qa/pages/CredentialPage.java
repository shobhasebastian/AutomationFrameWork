package com.wbl.qa.pages;

import java.io.IOException;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import com.wbl.qa.base.TestBase;

public class CredentialPage extends TestBase{
	
	@FindBy(id="ap_email")
	 WebElement email;


	@FindBy(name="password")
	WebElement password;
	@FindBy(id="continue")
	WebElement cont;

	@FindBy(id="signInSubmit")
	WebElement SignIn2;


	public CredentialPage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	public void contClick() {
		 cont.click();
		 
	 }
	 public void signIn2Click() {
		 SignIn2.click();
		 
	 }
	 
	public HomePage login(String un,String pwd) throws IOException {
		//WebDriverWait wait = new WebDriverWait(driver, 40);
		 email.sendKeys(un);
		 contClick();
		// wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ap-credential-autofill-hint"))));
		 password.sendKeys(pwd);
		 signIn2Click();
		 contClick();
		 return new HomePage();
		}
	
}
