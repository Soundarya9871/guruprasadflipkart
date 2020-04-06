package com.myntraTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.myntraGenericLib.Base;
import com.myntraObjectRepository.Home;
import com.myntraObjectRepository.Mobiles;

public class Capture_Price extends Base {
	@Test
	public void captureprice() throws Throwable {
		Home h = PageFactory.initElements(driver, Home.class);
		h.search();
		Thread.sleep(11000);
		Mobiles m = PageFactory.initElements(driver, Mobiles.class);
		m.captureprice();
	}
}
