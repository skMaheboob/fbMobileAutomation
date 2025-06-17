package Pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class LoginPage {
	private AndroidDriver driver;

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void login(String email, String password) throws InterruptedException {
        driver.findElement(By.xpath("(//android.widget.EditText)[1]")).sendKeys(email);
        driver.findElement(By.xpath("(//android.widget.EditText)[2]")).sendKeys(password);
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Log in\"]/android.view.ViewGroup")).click();
        Thread.sleep(2000);
    }

	
}
