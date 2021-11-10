package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;

public class Homepage {
 WebDriver driver;
 By adminTab=By.xpath("//*[@id='menu_admin_viewAdminModule']/b");
 By adminOrganization=By.xpath("/*[@id='menu_admin_Organization']/b");
 By adminOrganizationLocations=By.xpath("//*[@id='menu_admin_viewLocations']/b");
 By adminOrganizationLocationssearchLocation=By.xpath("//*[@id='searchLocation_name']/b");

 public Homepage(WebDriver driver) {
	 this.driver=driver;
 }
 
 public void moveToadminOrganizationLocations() {
	 Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(adminTab)).moveToElement(driver.findElement(adminOrganization)).
	 moveToElement(driver.findElement(adminOrganizationLocations)).moveToElement(driver.findElement(adminOrganizationLocationssearchLocation)).build().perform();
	 act.click();
 }
}
