package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class etsybase {
	public static WebDriver driver;

	@BeforeClass
	public void test()
	{
		driver=new ChromeDriver();
		driver.get("https://www.etsy.com/in-en/signin");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
				
	}

}

