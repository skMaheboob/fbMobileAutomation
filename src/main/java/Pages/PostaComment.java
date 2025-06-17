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
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
		    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").instance(7)")
		));

		
		element.click();
		
		driver.findElement(AppiumBy.className("android.widget.AutoCompleteTextView")).sendKeys("I am coming to Conquer");
		
		driver.findElement(AppiumBy.accessibilityId("POST")).click();
    	
    }
	
}
