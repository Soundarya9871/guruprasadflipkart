package com.myntraTestScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.myntraGenericLib.Base;
import com.myntraObjectRepository.MyCart;

public class Cart extends Base {
	@Test
	public void cart() throws Throwable {
		MyCart c = PageFactory.initElements(driver, MyCart.class);
		c.remove();
	}
}
