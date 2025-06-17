package Base;

import java.io.File;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import Utilities.ExtentManager;




public class BaseTest {
	 protected AndroidDriver driver;
	 protected static ExtentReports extent;
	 protected static ExtentTest test;
	 
	 
	

	    @BeforeSuite
	    public void setupExtent() {
	        extent=ExtentManager.getInstance();
	    }

	    @AfterSuite
	    public void flushExtent() {
	        extent.flush();
	    }
	    
	 

	    @BeforeClass
	    public void setUp() throws MalformedURLException {
	        UiAutomator2Options options = new UiAutomator2Options()
	                .setDeviceName("vivo V2025")
	                .setPlatformName("Android")
	                .setAutomationName("uiautomator2")
	                .setAppPackage("com.facebook.katana")
	                .setAppActivity("com.facebook.bloks.facebook.loggedout.FbExperimentalLoggedOutBloksActivity")
	                .setNoReset(true);

	        URL appiumServerUrl = URI.create("http://127.0.0.1:4723/").toURL();
	     
	        driver = new AndroidDriver(appiumServerUrl, options);
	      
	        

	      
	       
	        

	   
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    

	    @BeforeMethod
	    public void createTest(Method method) {
	        test = extent.createTest(method.getName());
	    }
	    @AfterMethod
	    public void handleTestResult(ITestResult result) {
	        if (result.getStatus() == ITestResult.FAILURE) {
	            test.fail(result.getThrowable());
	            String screenshotPath = takeScreenshot(result.getName());
	            test.addScreenCaptureFromPath(screenshotPath);
	        } else if (result.getStatus() == ITestResult.SUCCESS) {
	            test.pass("✅ Test Passed");
	        } else if (result.getStatus() == ITestResult.SKIP) {
	            test.skip("⚠️ Test Skipped");
	        }
	        
	    }
	    public String takeScreenshot(String testName) {
	        String path = "test-output/screenshots/" + testName + ".png";
	        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        try {
	            FileUtils.copyFile(src, new File(path));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return path;
	    }

}
