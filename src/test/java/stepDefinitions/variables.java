package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class variables {
	public WebDriver driver = null;
	
	public String baseUrl = "https://www.nixplay.com";
	public String fifteenInchHeader = "Nixplay 15-inch Original Wi-Fi Digital Picture Frame (Landscape)";
	public String overview = "Overview";
	public String techspecs = "Tech Specs";
	
	public WebElement nixplayFrames = driver.findElement(By.cssSelector("div[class='grid grid-cols-12 items-center']>div:nth-child(3)>ul>li>a[href='/collections/nixplay-smart-photo-frames']"));
	public WebElement fifteenInch = driver.findElement(By.cssSelector("div[class='collection-frames-container relative w-full py-16 mb-8 px-8 md:mb-16']>div>ul>li:nth-child(6)>a"));
	public String HeaderText = driver.findElement(By.cssSelector("div[class='flex items-center justify-between max-w-screen-2xl 2xl:max-w-screen-3xl mx-auto']>div>h1")).getText();
	public String OverviewText = driver.findElement(By.cssSelector("div[class='flex items-center justify-between max-w-screen-2xl 2xl:max-w-screen-3xl mx-auto']>div:nth-child(2)>ul>li:nth-child(1)>a")).getText();
	public String TechSpecsText = driver.findElement(By.cssSelector("div[class='flex items-center justify-between max-w-screen-2xl 2xl:max-w-screen-3xl mx-auto']>div:nth-child(2)>ul>li:nth-child(2)>a")).getText();
	
	
	public void testdriver() {		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		}
	
	}
