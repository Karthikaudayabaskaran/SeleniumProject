package selenium_controls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dropdownpassgener {

	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		WebElement Nopass	=driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']/div[2]"));
		Nopass.click();

		WebElement Adult	= driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"));
		//	Assert.assertTrue(Adult.isDisplayed());

		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//descendant::input")).sendKeys("MAA");
		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']//descendant::input")).sendKeys("IXM");
		driver.findElement(By.xpath("//*[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
		
		
		driver.findElement(By.xpath("//*[contains(text(),'Search Flight')]")).click();



		for (int i=0; i<=2; i++)
		{
			Adult.click();
		}

		System.out.println(Nopass.getText());
		driver.close();
	}

}
