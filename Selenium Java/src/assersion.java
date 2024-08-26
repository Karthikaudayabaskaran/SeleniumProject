import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assersion {

	public static void main(String[] args) {
		WebDriver driver=  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Karthi");
		String Enteredname="Karthi,";
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String DisplayedName=driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText();
		Assert.assertEquals("Hello "+ Enteredname , DisplayedName);
		//String[] TrimmedValue =DisplayedName.split("");
		//System.out.println(TrimmedValue[0]);
		String ExpectedResult="You are successfully logged in.";
		String ActualResult =driver.findElement(By.xpath("//p[contains(text(),'logged in')]")).getText();
		Assert.assertEquals(ActualResult, ExpectedResult);
		driver.findElement(By.xpath("//button[contains(text(),'Log Out')]"));
		driver.close();
		
	}

}
