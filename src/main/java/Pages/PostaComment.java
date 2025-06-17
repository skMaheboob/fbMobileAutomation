package Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class PostaComment {
	
	private AndroidDriver driver;

    public PostaComment(AndroidDriver driver) {
        this.driver = driver;
    }
    public void postcomment(String comment) throws InterruptedException {
	
		
		WebDriverWait Xam = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement postButton = (WebElement) Xam.until(ExpectedConditions
		    .elementToBeClickable(AppiumBy.accessibilityId("Make a post on Facebook")));
		postButton.click();
		//driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Make a post on Facebook\")")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").instance(7)")).click();
		
		driver.findElement(AppiumBy.className("android.widget.AutoCompleteTextView")).sendKeys("I am coming to Conquer");
		
		driver.findElement(AppiumBy.accessibilityId("POST")).click();
    	
    }
	
}
