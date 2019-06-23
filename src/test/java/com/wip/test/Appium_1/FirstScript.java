package com.wip.test.Appium_1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FirstScript {
	
	public static AndroidDriver driver;
	

	public static void main(String[] args) throws MalformedURLException, Throwable
	{
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc= new DesiredCapabilities();
		
		//dc.setCapability("browserName", "Chrome");
		dc.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		//dc.setCapability("deviceName", "Motorola");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME ,"Motorola");
		
		driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		
		driver.get("https://www.udemy.com/");
		
		String name= driver.getTitle();
		System.out.println(name);
		Thread.sleep(5000);
		driver.quit();
		System.out.println("Closed");
		

	}

}
