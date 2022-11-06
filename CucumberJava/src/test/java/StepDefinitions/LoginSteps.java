package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver = null;
	
	@Given("that user has correctemail@test.com and correctpassword")
	public void that_user_has_correctemail_test_com_and_correctpassword() {
	    System.out.println("Inside Step - user has valid email and password");
	}

	@When("the user opens the login page")
	public void the_user_opens_the_login_page() {
		System.out.println("Inside Step - user opens the login page");
		String projectPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to("https://www.shoecarnival.com/account");
	}

	@And("the user enters valid correctemail@test.com and correctpassword")
	public void the_user_enters_valid_correctemail_test_com_and_correctpassword() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("correctemail@test.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("correctpassword");
		driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
		System.out.println("Inside Step - user enters valid email and password");
		Thread.sleep(10000);
	}

	@Then("the user successfully logs in")
	public void the_user_successfully_logs_in() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - user successfully logs in");
		driver.findElement(By.xpath("//h1[@class='MuiBox-root jss1411']")).isDisplayed();
	}

	@And("the home catalog page is displayed")
	public void the_home_catalog_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - home page is displayed");
		driver.findElement(By.xpath("//h1[@class='MuiBox-root jss1411']")).isDisplayed();
		driver.close();
		driver.quit();
	}

	@Given("that user has alsoanemail@test.com and alsoapassword")
	public void that_user_has_alsoanemail_test_com_and_alsoapassword() {
	    System.out.println("Inside Step - user has valid email and password");
	}

	@When("the user enters valid alsoanemail@test.com and alsoapassword")
	public void the_user_enters_valid_alsoanemail_test_com_and_alsoapassword() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("alsoanemail@test.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("alsoapassword");
		driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
		System.out.println("Inside Step - user enters valid email and password");
		Thread.sleep(10000);
	}
}
