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
	@Given("that user is in a catalog")
	public void that_user_is_in_a_catalog() {
		
		System.out.println("I am in the Catalog");
		String projectPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to("https://www.shoecarnival.com/mens/athletics_and_sneakers/running_shoes");
	    
	}

	@When("the user clicks on the Single Arrow Forward")
	public void the_user_clicks_on_the_Single_Arrow_Forward() {
	   //driver.findElement(By.className("ais-Pagination-link")).sendKeys(Keys.ENTER);
	   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[4]/div[2]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[4]/a[1]")).sendKeys(Keys.ENTER);
	   System.out.println("Single Arrow Forward has been clicked");
	}

	@And("the user is on page {int}")
	public void the_user_is_on_page(Integer int1) {
	    System.out.println("I am in page no. " + int1);
	}

	@Then("the page {int} of the catalog shall be displayed")
	public void the_page_of_the_catalog_shall_be_displayed(Integer int1) {
	    System.out.println(" the page no. displayed is " + int1);
	}

	@When("the user clicks on the Double Arrow Forward")
	public void the_user_clicks_on_the_Double_Arrow_Forward() {
	    System.out.println("Double arrow forward has been clicked");
	}

	@When("the user clicks on the Single Arrow Backward")
	public void the_user_clicks_on_the_Single_Arrow_Backward() {
	    System.out.println("Single Arrow Backward has been clicked");
	}

	@When("the user clicks on the Double Arrow Backward")
	public void the_user_clicks_on_the_Double_Arrow_Backward() {
	    System.out.println("Double Arrow Backward has been Clicked");
	}
}
