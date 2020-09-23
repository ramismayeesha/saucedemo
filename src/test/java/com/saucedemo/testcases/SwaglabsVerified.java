package com.saucedemo.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.saucedemo.base.TestBase;

public class SwaglabsVerified extends TestBase {

	
	@Test
	public static void swagLabsLogoVerified () throws InterruptedException {
		boolean isSwagLagsLogoDisplayed = isDisplayedBy(By.xpath(OR.getProperty("LOGO")));
		if (isSwagLagsLogoDisplayed == true) {
			log.debug("SwagLabs logo is displayed and verified");
			delay(3000);
		}
	}

	
	
	@Test
	public static void itemsAvailableVerified () {
		List<WebElement> itemsAvailable = driver.findElements(By.xpath(OR.getProperty("ITEMS_AVAILABLE")));
	if (itemsAvailable.size() == 18) {
		log.debug("There are 18 items displayed, including the price and add to cart option");
		}
	else {
		log.debug("There are not 18 items displayed, including the price and add to cart option");
		}
	for (WebElement option : itemsAvailable) {
		String printList = option.getText();
		log.debug(printList);
		
		}
	}
	
	
}