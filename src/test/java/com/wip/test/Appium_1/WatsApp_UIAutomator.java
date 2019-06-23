package com.wip.test.Appium_1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.FontUIResource;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class WatsApp_UIAutomator
{
public static AndroidDriver<MobileElement> driver;
	
	public static void main(String[] args) throws MalformedURLException, Throwable
	{
		// TODO Auto-generated method stub
		
		
		DesiredCapabilities dc= new DesiredCapabilities();
		
		
		dc.setCapability("deviceName", "Moto G5 Plus");
		
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "8.1.0");
		dc.setCapability("udid", "ZY22442929");
		dc.setCapability("appPackage", "com.whatsapp");
		dc.setCapability("appActivity", "com.whatsapp.HomeActivity");
		
		
		driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("android.widget.TextView[@text='Ashwini']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.whatsapp:id/entry")).sendKeys("Hello Ashwini");
		Thread.sleep(1000);
		driver.findElement(By.xpath("android.widget.ImageView[@index='0']")).click();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
