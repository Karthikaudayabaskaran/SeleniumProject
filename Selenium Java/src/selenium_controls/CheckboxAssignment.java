package selenium_controls;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxAssignment {

	public static void main(String[] args) {
		/*

	Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked

	How to get the Count of number of check boxes present in the page
		 */

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement SelectedCheckbox=	driver.findElement(By.id("checkBoxOption1"));
		SelectedCheckbox.click();
		Boolean checked =SelectedCheckbox.isSelected();
		System.out.println(checked);
		Assert.assertTrue(checked);
		
		SelectedCheckbox.click();
		Boolean unchecked =SelectedCheckbox.isSelected();
		System.out.println(unchecked);
	//	Assert.assertTrue(unchecked);
		System.out.println();
System.out.println(

driver.findElements(By.cssSelector("input[type='checkbox']")).size()
		);

driver.close();
	}
	

}
