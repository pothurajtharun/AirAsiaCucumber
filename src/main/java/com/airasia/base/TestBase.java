package com.airasia.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.airasia.util.TestUtil;



public class TestBase {

	protected static WebDriver driver;
	protected static Properties prop;
	
	
	
	public TestBase() {
		try {
			prop= new Properties();
			//C://Users//38223//eclipse-workspace//AirAsia//src//main//java//com//airasia//config//config.properties
			FileInputStream fip = new FileInputStream("C://Users//tharu//git//AirAsiaCucumber//src//main//java//com//airasia//config//config.properties");
			prop.load(fip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) { 
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			//C://Users//38223//Downloads//driver//chromedriver//chromedriver.exe
			System.setProperty("webdriver.chrome.driver", "D://Dev Softwares//Automation Jars//chromedriver//chromedriver.exe");
			driver = new ChromeDriver();
		}
		//Here if want initialize FF driver or gecko Driver or else
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		

	}
	
	
	
	
}