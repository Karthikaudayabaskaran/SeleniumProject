package selenium_controls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownpassgener {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		WebElement Nopass	=driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']/div[2]"));
		Nopass.click();
		
	WebElement Adult	= driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"));
	
	for (int i=0; i<=2; i++)
	{
		Adult.click();
	}
		
	System.out.println(Nopass.getText());
	driver.close();
	}

}
