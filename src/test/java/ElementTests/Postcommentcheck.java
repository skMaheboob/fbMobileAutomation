package ElementTests;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import io.appium.java_client.AppiumBy;

public class Postcommentcheck  extends BaseTest {
	

    
    
    public void verifyLoginUsingCreateIconResourceId() {
        try {
            WebElement createIcon = driver.findElement(
                AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/actual_create_icon_id\").instance(0)")
            );
            Assert.assertTrue(createIcon.isDisplayed(), "❌ User is not logged in — Create icon missing.");
            System.out.println("✅ Login confirmed — Create icon found.");
        } catch (Exception e) {
            Assert.fail("❌ Login verification failed — Element not found.");
        }
    }
    
   


    
    @Test
	public void comment() throws InterruptedException {
		
		
		
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
