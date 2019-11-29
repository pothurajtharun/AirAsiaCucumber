package com.airasia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.airasia.base.TestBase;




public class AirasiaHomePage extends TestBase{
	
		//Page Factory - OR
	
		
		@FindBy(xpath="//*[@class='product-tile-icon']")
		WebElement productTitle;
	
		@FindBy(xpath="//*[@class='ng-tns-c46-2 padding-less left-input modify-search']")
		WebElement fromSearchField;
		
		@FindBy(xpath="//*[@class='ng-tns-c46-2 padding-less left-input modify-search focus active']")
		WebElement fromSearchActive; 
		
		@FindBy(xpath="//li[@id='home-origin-autocomplete-heatmaplist-0']")
		WebElement fromDrop;
		
		
		@FindBy(xpath="//*[@class='ng-tns-c46-3 padding-less right-input modify-search']")
		WebElement toSearchField;
		
		@FindBy(xpath="//input[@id='home-destination-autocomplete-heatmap']")
		WebElement toSearchActive; 

		
		@FindBy(xpath="//li[@id='home-destination-autocomplete-heatmaplist-0']")
		WebElement toDrop;
		
		
		@FindBy(xpath="//a[@class='input-daterange input-left from']")
		WebElement departDate;

		@FindBy(xpath="//label[@class='ng-tns-c48-4' and text()='One way']")
		WebElement oneWay;
		
		@FindBy(xpath="//a[@class='date ng-tns-c48-4 available ng-star-inserted startdate']")
		WebElement dateSelect;
		
		@FindBy(xpath="//button[@class='calendar-button']")
		WebElement confirmbutton;
		
		@FindBy(xpath="//button[@id='home-flight-search-airasia-button-inner-button-select-flight-heatmap']")
		WebElement submitButton;
		
		
		
		//Initializing the Page Objects
		public AirasiaHomePage() {
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateAirasiaHomePageTitle() {
			return driver.getTitle();
		}
		
		public void fromSearchField() throws InterruptedException {
			productTitle.click();
			Thread.sleep(5000);
			fromSearchField.clear();
			fromSearchField.click();
			fromSearchActive.sendKeys("BLR");
			fromDrop.click();
		}
		
		public void oneWay() {
			
			oneWay.click();
		}
		
		public void toSearchField() {
			//toSearchField.click();
			toSearchActive.sendKeys("PUNE");
			toDrop.click();
		}
		
		public void confirmbutton() {
			
			confirmbutton.click();
		}
		
		public void submitButton() {
			
			submitButton.click();
		}
		
		
		
}