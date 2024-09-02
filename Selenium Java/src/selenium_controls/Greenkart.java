package selenium_controls;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Greenkart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));





		//Convert array to List
		String[] VegList = {"Brocolli","Carrot"};

		additems(driver,VegList);
		applycoupon(driver);

	}


	public static void additems(WebDriver driver,	String[] VegList)

	{
		List<WebElement> AllProducts=	driver.findElements(By.xpath("//*[@class='product-name']"));
		List<WebElement>  addtocard=driver.findElements(By.xpath("//button[text()='ADD TO CART']"));

		List ItemstoAdd = Arrays.asList(VegList);
		//Iterate over all product 
		for (int i=0; i <AllProducts.size();i++)
		{
			//Convert to string
			String[] vegetableslist = AllProducts.get(i).getText().split("-");
			String Forveg = vegetableslist[0].trim();
			System.out.println(Forveg);

			int j=0;
			//Compare the items to add over the list of products and click on add to cart
			if (ItemstoAdd.contains(Forveg))
			{	
				j++;

				addtocard.get(i).click();
				if (j==3)
				{
					break;
				}
			}
			//driver.close();

		}
		//Proceed to checkout without promocode
		driver.findElement(By.xpath("//*[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		/*	driver.findElement(By.xpath("//button[text()='Place Order']")).click();

		//Select the count and checkbox
		WebElement Countrydropdown =driver.findElement(By.xpath("//div/select"));
		Select Country = new Select(Countrydropdown);
		Countrydropdown.click();
		Country.selectByVisibleText("India");
		driver.findElement(By.xpath("//*[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		 */

	}


	public static void applycoupon(WebDriver driver) {
		

		WebElement Promocode =driver.findElement(By.xpath("//*[@class='promoCode']"));
		Promocode.click();
		Promocode.sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//*[text()='Apply']")).click();
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.xpath("//*[text()='Code applied ..!']")));
	
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();

		//Select the count and checkbox
		WebElement Countrydropdown =driver.findElement(By.xpath("//div/select"));
		Select Country = new Select(Countrydropdown);
		Countrydropdown.click();
		Country.selectByVisibleText("India");
		driver.findElement(By.xpath("//*[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();

	}
}

