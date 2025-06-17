package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Profilepage {
	private AndroidDriver driver;

    public Profilepage(AndroidDriver driver) {
        this.driver = driver;
    }
    public void updatepic() throws InterruptedException {
    	
    	Thread.sleep(2000);
		 
		  driver.findElement(AppiumBy.accessibilityId("Profile, tab 4 of 6")).click();
		  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Edit profile picture button\").instance(0)")).click();
		  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Photo taken on May 30, 2025 17:34\").instance(1)")).click();
		  driver.findElement(AppiumBy.accessibilityId("SAVE")).click();
		  Thread.sleep(10000);
		  driver.findElement(AppiumBy.accessibilityId("Close")).click();
		  driver.findElement(AppiumBy.accessibilityId("Home, tab 1 of 6")).click();
		  
	  }

}
