package com.myntraObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.myntraGenericLib.Fileutil;

public class Logout {
	@FindBy(xpath = "//div[text( )='Guruprasad']")
	private WebElement MyAccount;

	public WebElement getMyAccount() {
		return MyAccount;
	}

	@FindBy(xpath = "//div[text( )='Logout']")
	private WebElement Logout;

	public WebElement getLogout() {
		return Logout;
	}

	public void logout(WebDriver driver) {
		Fileutil ft = new Fileutil();
		ft.moveToElement(driver, MyAccount);
		Logout.click();
	}

	
}
