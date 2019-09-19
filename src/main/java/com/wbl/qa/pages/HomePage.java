package com.wbl.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.wbl.qa.base.TestBase;

public class HomePage  extends TestBase{
	
	@FindBy(xpath="//span[contains(text(),'Hello shobha')]")
	WebElement userlabel;
	@FindBy(id="nav-link-accountList")
	WebElement orderlink;

	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public String verifyHomeageTitle() {
		return driver.getTitle();
	}

	public OrdersPage orderClick() throws IOException {
		orderlink.click();
		return new OrdersPage();
	}
}
