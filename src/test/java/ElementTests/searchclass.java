package ElementTests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class searchclass extends BaseTest {
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
	public void searchfriends(String name) throws InterruptedException {
		  Thread.sleep(1000);
		  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Home, tab 1 of 6\")")).click();
		  driver.findElement(AppiumBy.accessibilityId("Search Facebook")).click();
		  driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys(name);
	      driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	      Thread.sleep(100);
	      driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Back\")")).click();
	      driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Back\")")).click();

}
}


