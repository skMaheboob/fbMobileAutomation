package ElementTests;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.functions.ExpectedCondition;

public class UpdateProfilepic extends BaseTest {
	@Test
	public void verifyLoginUsingCreateIconResourceId() {
        try {
            WebElement Home= driver.findElement(
                AppiumBy.xpath("//android.view.View[@content-desc=\"Home, tab 1 of 6\"]"));
            
            Assert.assertTrue(Home.isDisplayed(), "❌ User is not logged in — Create icon missing.");
            System.out.println("✅ Login confirmed — Create icon found.");
        } catch (Exception e) {
            Assert.fail("❌ Login verification failed — Element not found.");
        }
    }
    
	    
	   @Test
	  public void updatepic() throws InterruptedException {
		   
		  
		   
		   
		   
		  driver.findElement(AppiumBy.accessibilityId("Profile, tab 4 of 6")).click();
		  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Edit profile picture button\").instance(0)")).click();
		  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Photo taken on May 30, 2025 17:34\").instance(1)")).click();
		  driver.findElement(AppiumBy.accessibilityId("SAVE")).click();
		  Thread.sleep(5000);
		  driver.findElement(AppiumBy.accessibilityId("Close")).click();
		  
	  }
	
	

}
