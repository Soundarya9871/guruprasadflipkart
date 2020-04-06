package com.myntraTestScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.myntraGenericLib.Base;
import com.myntraObjectRepository.MyAccount;

public class Profile extends Base {
	@Test
	public void profile() {
		MyAccount ma = PageFactory.initElements(driver, MyAccount.class);
		ma.ProfileEdit(driver);
	}
}