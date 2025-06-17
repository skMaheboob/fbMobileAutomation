package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class SearchPage {
	private AndroidDriver driver;
	
	 public SearchPage(AndroidDriver driver) {
	        this.driver = driver;
	    }
  public void searchfriends(String name) throws InterruptedException {
	  Thread.sleep(1000);
	  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Home, tab 1 of 6\")")).click();
	  driver.findElement(AppiumBy.accessibilityId("Search Facebook")).click();
	  driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys(name);
      driver.pressKey(new KeyEvent(AndroidKey.ENTER));
      Thread.sleep(100);
      driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Back\")")).click();
      driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Back\")")).click();

    //  driver.findElement(AppiumBy.accessibilityId("Back")).click();


	  
	  
  }

}
  


