package com.wip.test.Appium_1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallFastDateCapture
{
	public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException, Throwable
	{
		// TODO Auto-generated method stub
		
		
		//File app= new File("D:\\APK_Files\\selendroid-test-app-0.17.0.apk");
		File app= new File("D:\\APK_Files\\Fast Scheduler Calendar_v1.0.7_apkpure.com.apk");
		
		DesiredCapabilities dc= new DesiredCapabilities();
		
		
		dc.setCapability("deviceName", "Moto G5 Plus");
		
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "8.1.0");
		dc.setCapability("udid", "ZY22442929");
		dc.setCapability("app", app.getAbsolutePath());
		dc.setCapability("noReset", "true");
		
		
		driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement el= driver.findElement(By.id("com.linever.fastscheduler.android:id/edMemo"));
		el.sendKeys("Birthday");
		
		Thread.sleep(3000);
		
		
		driver.close();

	}

}
