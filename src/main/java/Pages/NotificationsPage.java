package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class NotificationsPage {
	private AndroidDriver driver;

    public NotificationsPage(AndroidDriver driver) {
        this.driver = driver;
    }
    
    public void Notifications() throws InterruptedException {
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    	
    	WebElement notificationsTab = wait.until(ExpectedConditions.visibilityOfElementLocated(
    	    By.xpath("//android.view.View[starts-with(@content-desc, 'Notifications, tab 5 of 6')]")
    	));

    	
    	notificationsTab.click();
    	
  	  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Home, tab 1 of 6\")")).click();

    	    
    

}

	
}

