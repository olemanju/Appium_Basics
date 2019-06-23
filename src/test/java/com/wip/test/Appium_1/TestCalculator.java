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

public class TestCalculator
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
		dc.setCapability("appPackage", "com.google.android.calculator");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		
		driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		MobileElement four= driver.findElement(By.id("com.google.android.calculator:id/digit_4"));
		Thread.sleep(1000);
		MobileElement mul= driver.findElement(By.id("com.google.android.calculator:id/op_mul"));
		Thread.sleep(1000);
		MobileElement eight= driver.findElement(By.id("com.google.android.calculator:id/digit_8"));
		Thread.sleep(1000);
		MobileElement equl= driver.findElement(By.id("com.google.android.calculator:id/eq"));
		Thread.sleep(1000);
		MobileElement result= driver.findElement(By.className("android.widget.TextView"));
		
		four.click();
		mul.click();
		eight.click();
		equl.click();
		
		String res= result.getText();
		System.out.println(res);
		
		driver.quit();

	}

}
