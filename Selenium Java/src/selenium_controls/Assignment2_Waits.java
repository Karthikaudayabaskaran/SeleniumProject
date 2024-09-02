package selenium_controls;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2_Waits {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		WebElement UName=driver.findElement(By.xpath("//input[@id='username']"));
		WebElement Pass=driver.findElement(By.xpath("//input[@id='password']"));
		WebElement user=driver.findElement(By.xpath("//input[@value='user']"));
		WebElement okay=driver.findElement(By.xpath("//button[@id='okayBtn']"));
		WebElement signin=driver.findElement(By.xpath("//input[@name='signin']"));
		WebElement opt=driver.findElement(By.xpath("//*[@class='form-control' and @data-style='btn-info']"));
		Select dd= new Select(opt);

	
		UName.click();
		UName.sendKeys("rahulshettyacademy");
		Pass.sendKeys("learning");
		user.click();
		WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(60));
		w.until(ExpectedConditions.elementToBeClickable(okay));
		okay.click();
		dd.selectByVisibleText("Consultant");
		signin.click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.nav-link.btn.btn-primary")));
		List<WebElement> PhoneNames=driver.findElements(By.xpath("//h4/a"));
		List<WebElement> Add	=driver.findElements(By.xpath("//*[@class='btn btn-info']"));
		for (int i=0; i<PhoneNames.size();i++)
		{
			Add.get(i).click();
			
		}
		
		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
	}

}
