package com.wip.test.Appium_1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.FontUIResource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Dialer_UIAutomator_dynamic
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
		dc.setCapability("appPackage", "com.android.dialer");
		dc.setCapability("appActivity", "com.android.dialer.app.DialtactsActivity");
		
		
		driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		 WebElement dialerA= driver.findElement(By.id("com.android.dialer:id/floating_action_button"));
		 dialerA.click();
		 Thread.sleep(3000);
		 List<MobileElement> dialNumber= driver.findElements(By.className("android.widget.FrameLayout"));
		 dialNumber.get(9).click();
		 Thread.sleep(1000);
		 dialNumber.get(8).click();
		 Thread.sleep(1000);
		 dialNumber.get(7).click();
		 Thread.sleep(1000);
		 dialNumber.get(4).click();
		 Thread.sleep(1000);
		 dialNumber.get(3).click();
		 Thread.sleep(1000);
		 dialNumber.get(2).click();
		 Thread.sleep(1000);
		 dialNumber.get(2).click();
		 Thread.sleep(1000);
		 dialNumber.get(4).click();
		 Thread.sleep(1000);
		 dialNumber.get(5).click();
		
		 Thread.sleep(4000);
		 WebElement totalnumber= driver.findElement(By.id("com.android.dialer:id/digits"));
		 String numb= totalnumber.getText();
		 System.out.println(numb);
		 Thread.sleep(3000);
		 WebElement click_call= driver.findElement(By.id("com.android.dialer:id/dialpad_floating_action_button"));
		 click_call.click();
		 Thread.sleep(4000);
		 
		 
		 
		driver.quit();

	}
	
	
		
		
		
		
	

}
