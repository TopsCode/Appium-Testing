package com.mobile.MyFirstTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class CalculatorsDemo 
{
	static AppiumDriver driver=null;
	public static void main(String[] args) throws InterruptedException 
	{
		try {
			opencalculator();
		} catch (MalformedURLException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void opencalculator() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability("deviceName", "vivo 1806");
		cap.setCapability("udid", "QOKBUKS4PFQSV8X4");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.android.bbkcalculator");
		cap.setCapability("appActivity", "com.android.bbkcalculator.Calculator");
		cap.setCapability("automationName", "UiAutomator2");
		URL url=new URL("http://127.0.0.1:4723/");
		
		driver=new AppiumDriver(url,cap);
		
		Thread.sleep(2000);
		driver.findElement(By.id("com.android.bbkcalculator:id/digit7")).click();
	}
}
