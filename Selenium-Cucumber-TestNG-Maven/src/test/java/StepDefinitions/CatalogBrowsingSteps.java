package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CatalogBrowsingSteps {
	
	WebDriver driver = null;
	
	
	
	@Given("that user is on page {int}")
	public void that_user_is_on_page(Integer int1) {
		
		String projectPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to("https://www.shoecarnival.com/mens/athletics_and_sneakers/running_shoes?page="+int1);
	    
	}
	


	@When("the user clicks on the Single Arrow Forward")
	public void the_user_clicks_on_the_Single_Arrow_Forward() {
	   //working
	   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[4]/div[2]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[4]/a[1]")).sendKeys(Keys.ENTER);
	   System.out.println("Single Arrow Forward has been clicked");
	}

	
	@Then("the page {int} of the catalog shall be displayed")
	public void the_page_of_the_catalog_shall_be_displayed(Integer int1) {
		 if(driver.getCurrentUrl().contentEquals("https://www.shoecarnival.com/mens/athletics_and_sneakers/running_shoes?page="+int1))
		 {
			 driver.navigate().to("https://www.google.com/search?q=Success+Template+HTML&rlz=1C1ONGR_enPK1019PK1019&hl=en&source=lnms&tbm=isch&sa=X&ved=2ahUKEwij9Pm60YP7AhWFOHoKHRLxDNUQ_AUoAXoECAIQAw&biw=1366&bih=657&dpr=1#imgrc=TU2EVoz74Q2l7M");
			 driver.close();
			 driver.quit();
		 }
		 else
		 {
			 driver.navigate().to("https://www.google.com/search?q=failed+Template+HTML&tbm=isch&ved=2ahUKEwj3yIHE0YP7AhUUgs4BHb5CDZMQ2-cCegQIABAA&oq=failed+Template+HTML&gs_lcp=CgNpbWcQA1CtAVjiDmDbD2gAcAB4AIAB8wOIAZshkgEFMy05LjKYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=kCpcY_fAMpSEur4PvoW1mAk&bih=657&biw=1366&rlz=1C1ONGR_enPK1019PK1019&hl=en#imgrc=bG5yw9tNHwXb5M");
		 }
	}

	@When("the user clicks on the Double Arrow Forward")
	public void the_user_clicks_on_the_Double_Arrow_Forward() {
		//working
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[4]/div[2]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[6]/a[1]")).sendKeys(Keys.ENTER);
	}

	@When("the user clicks on the Single Arrow Backward")
	public void the_user_clicks_on_the_Single_Arrow_Backward() {
		//working
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[4]/div[2]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/a[1]")).sendKeys(Keys.ENTER);
	}

	@When("the user clicks on the Double Arrow Backward")
	public void the_user_clicks_on_the_Double_Arrow_Backward() {
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[4]/div[2]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/a[1]")).sendKeys(Keys.ENTER);
	}
}
