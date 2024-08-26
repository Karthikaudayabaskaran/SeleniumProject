package selenium_controls;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class staticdropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//Static dropdown - Select tag 
		
		WebElement curreny =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown= new Select(curreny);
		
		//different ways to select the dropdown
		
		dropdown.selectByIndex(1);
		String Selected =dropdown.getFirstSelectedOption().getText();
		System.out.println(Selected);
		String Expected ="INR";
		Assert.assertEquals(Selected, Expected, "Not matched");
		
		dropdown.selectByValue("USD");
		String Selected1 =dropdown.getFirstSelectedOption().getText();
		System.out.println(Selected);
		String Expected1 ="USD";
		Assert.assertEquals(Selected1, Expected1, "Not matched");
		
		dropdown.selectByVisibleText("AED");
		String Selected2 =dropdown.getFirstSelectedOption().getText();
		System.out.println(Selected);
		String Expected2 ="USD";
		Assert.assertEquals(Selected2, Expected2, "Not matched");
		
		
		
		
		
		
		
		
		
		
		driver.close();
		
	}

}
