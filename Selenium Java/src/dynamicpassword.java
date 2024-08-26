import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class dynamicpassword {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String Pass=getPassword(driver);

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Karthi");
		String Enteredname="Karthi,";
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Pass);		
		System.out.println(Pass);
		Thread.sleep(3000);
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

	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String Password =driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		//String Newpass=Password.substring(31,49);
		String[] Newpass=Password.split("'");
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		return Newpass[1];


	}


}





