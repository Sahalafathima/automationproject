package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class etsypage {
	WebDriver Driver;
	//@FindBy(xpath="//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[1]/button")
	//WebElement sigin;
	@FindBy(xpath="//*[@id=\"join_neu_email_field\"]")
	WebElement email;
	@FindBy(xpath="//*[@id=\"join_neu_password_field\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"join-neu-form\"]/div[1]/div/div[7]/div/button")
	WebElement siginbutton;
	@FindBy(xpath="//*[@id=\"global-enhancements-search-query\"]")
	WebElement search;
	@FindBy(xpath="//*[@id=\"gnav-search\"]/div/div[1]/button[2]/span/svg")
	WebElement searchbutton;
	@FindBy(xpath="//*[@id=\"content\"]/div/div[1]/div/div[3]/div[9]/div/div[2]/div/div[1]/div/ul/li[1]/div/a/div[1]/div/div/div/img")
	WebElement firstproduct;
	@FindBy(xpath="//*[@id=\"listing-page-cart\"]/div[6]/div[1]/div[2]/div[3]/form/div/button")
	WebElement addtocart;
	@FindBy(xpath="//*[@id=\"desktop-category-nav\"]/div/div/ul/li[1]/a")
	WebElement homepage;
	@FindBy(xpath="//*[@id=\"content\"]/div/div[7]/div/div/div/div[5]/div/a/div[1]/div/div/div/img")
	WebElement product;
	@FindBy(xpath="//*[@id=\"listing-page-cart\"]/div[6]/div[2]/div/button/span/svg/path")
	WebElement wishlist; 
	
	public etsypage(WebDriver driver)
	{
		this.Driver=driver;
		PageFactory.initElements(driver, this);
	}
	//public void sigin()
	//{
		//sigin.click();
	//}
	public void setvalues(String un,String pswd)
	{
		email.sendKeys(un);
		password.sendKeys(pswd);
	}
	public void siginbutton()
	{
		siginbutton.click();
	}
	public void search(String s)
	{
		search.sendKeys(s);
	}
	public void searchbutton()
	{
		searchbutton.click();
	}
	public void firstproduct()
	{
		firstproduct.click();
	}
	public void addtocart()
	{
		addtocart.click();
		
	}
	public void homepage()
	{
		homepage.click();
	}
	public void product()
	{
		
		JavascriptExecutor js=(JavascriptExecutor) Driver;
		js.executeScript("Window.scrollBy(0, 30000)");
		product.click();
	}
	public void wishlist()
	{
		wishlist.click();
	}
	
	
	

}
