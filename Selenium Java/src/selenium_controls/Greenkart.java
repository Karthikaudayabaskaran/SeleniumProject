package selenium_controls;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Greenkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		List<WebElement> AllProducts=	driver.findElements(By.xpath("//*[@class='product-name']"));
		List<WebElement>  addtocard=driver.findElements(By.xpath("//button[text()='ADD TO CART']"));

		//Convert array to List
		String[] VegList = {"Brocolli","Carrot"};
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
				Thread.sleep(3000);
				addtocard.get(i).click();
				if (j==3)
				{
					break;
				}
			}
			//driver.close();

		}
		//Proceed to checkout
		driver.findElement(By.xpath("//*[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
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