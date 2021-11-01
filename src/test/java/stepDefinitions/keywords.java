package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.*;

public class keywords {
		
		WebDriver driver = null;

		@Given("User opens Nixplay website")
		public void user_opens_nixplay_website() {
			String projectPath = System.getProperty("user.dir");
			String baseUrl = "https://www.nixplay.com";
			
			System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		    
			driver.get(baseUrl);
			driver.manage().window().maximize();
			System.out.println("User opens Nixplay website");
		}

		@When("User clicks on Nixplay Frames tab")
		public void user_clicks_on_nixplay_frames_tab() {
			WebElement nixplayFrames = driver.findElement(By.cssSelector("div[class='grid grid-cols-12 items-center']>div:nth-child(3)>ul>li>a[href='/collections/nixplay-smart-photo-frames']"));
			
			nixplayFrames.click();
			System.out.println("User clicks on “Nixplay Frames” tab");
		}

		@And("User clicks on Fifteen Inch option at the top of the page")
		public void user_clicks_on_fifteen_inch_option_at_the_top_of_the_page() {
			WebElement fifteenInch = driver.findElement(By.cssSelector("div[class='collection-frames-container relative w-full py-16 mb-8 px-8 md:mb-16']>div>ul>li:nth-child(6)>a"));
			
			fifteenInch.click();
			System.out.println("User clicks on 15 inch option at the top of the page");
		}

		@Then("Header and tabs are valid")
		public void header_and_tabs_are_valid() {
			String fifteenInchHeader = "Nixplay 15-inch Original Wi-Fi Digital Picture Frame (Landscape)";
			String overview = "Overview";
			String techspecs = "Tech Specs";
			String HeaderText = driver.findElement(By.cssSelector("div[class='flex items-center justify-between max-w-screen-2xl 2xl:max-w-screen-3xl mx-auto']>div>h1")).getText();
			String OverviewText = driver.findElement(By.cssSelector("div[class='flex items-center justify-between max-w-screen-2xl 2xl:max-w-screen-3xl mx-auto']>div:nth-child(2)>ul>li:nth-child(1)>a")).getText();
			String TechSpecsText = driver.findElement(By.cssSelector("div[class='flex items-center justify-between max-w-screen-2xl 2xl:max-w-screen-3xl mx-auto']>div:nth-child(2)>ul>li:nth-child(2)>a")).getText();
			
			Assert.assertEquals(HeaderText,fifteenInchHeader);
			Assert.assertEquals(OverviewText,overview);
			Assert.assertEquals(TechSpecsText,techspecs);
			
			driver.close();
			driver.quit();
		}

}


