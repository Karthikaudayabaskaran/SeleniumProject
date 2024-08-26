import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selintro {

	public static void main(String[] args) {
		WebDriver driver=  new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);
		String Currl=driver.getCurrentUrl();
		System.out.println(Currl);
		driver.close();
		System.out.println("Chrome Closed");
	}

}
