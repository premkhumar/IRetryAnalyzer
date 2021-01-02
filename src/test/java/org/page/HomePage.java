package org.page;

import java.util.Iterator;
import java.util.Set;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomePage extends LibGlobal{
	
	@BeforeSuite
	private void browserlaunch() {

		browserLaunchChrome();
		maxWindows();
		enterUrl("https://www.amazon.in/");
		implicitWait(10);
		
	}
	@Test(priority=-4)
	private void searchBox() {

		WebElement txtSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearchBox.sendKeys("oneplus bullets");
		
		WebElement btnSubmit = driver.findElement(By.id("nav-search-submit-button"));
		click(btnSubmit);
		
		
		
	}
	@Test(priority=-3)
	private void product() {
		WebElement oneplusBullets = driver.findElement(By.xpath("//*[text()='OnePlus Bullets Wireless Z Bass Edition (Reverb Red)']"));
		oneplusBullets.click();
	}
	@Test(priority=-2)
	private void oneplus() {
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> WindowList = driver.getWindowHandles();
		Iterator<String> i = WindowList.iterator();
//		while (i.hasNext()) {
//			String secondWindow = i.next();
//			if (!parentWindow.equalsIgnoreCase(secondWindow)) {
//				driver.switchTo().window(secondWindow);
//			}
//		}
		
		WebElement bBlue = driver.findElement(By.xpath("//*[@alt='Bass Blue']"));
		bBlue.click();
		
	}
	
	
	
}
