import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {

	public static void main(String[] args) {
		WebDriver driver=  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		/*
		driver.findElement(By.id("inputUsername")).sendKeys("check");
		driver.findElement(By.name("inputPassword")).sendKeys("password");
		driver.findElement(By.className("signInBtn")).click();
		
		String Error=driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(Error);
		*/
		
		//FORGOT PASSWORD
		//***************
	/*	
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());	*/
		
		//USING XPATH 
		//*************
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'logged in')]")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Log Out')]"));
		
	//	System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());
		
		driver.close();
		
		
		
		
		
	
		
		
		
	}	

}
