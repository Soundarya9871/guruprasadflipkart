package com.myntraTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.myntraGenericLib.Base;
import com.myntraGenericLib.Fileutil;
import com.myntraObjectRepository.Home;
import com.myntraObjectRepository.Mobiles;

public class Add_To_Wishlist extends Base {
	Fileutil fu = new Fileutil();

	@Test
	public void addtowhishlist() throws Throwable {
		Home h = PageFactory.initElements(driver, Home.class);
		h.search();
		Thread.sleep(11000);
		Mobiles m = PageFactory.initElements(driver, Mobiles.class);
		m.addtowishlist();
		m.heart(driver);
	}
}
