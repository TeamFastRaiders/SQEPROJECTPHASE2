package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangePasswordSteps {
	WebDriver driver = null;
	
	@Given("user is logged in with correctpassword")
	public void user_is_logged_in_with_correctpassword() throws InterruptedException {
		System.out.println("Inside Step - user has valid current and new password");
		String projectPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to("https://www.shoecarnival.com/account");
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("correctemail@test.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("correctpassword");
		driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
		Thread.sleep(10000);
	}
	
	@Given("user is logged in with alsoapassword")
	public void user_is_logged_in_with_alsoapassword() throws InterruptedException {
		System.out.println("Inside Step - user has valid current and new password");
		String projectPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to("https://www.shoecarnival.com/account");
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("alsoanemail@test.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("alsoapassword");
		driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
		Thread.sleep(10000);
	}
	
	@And("I have a valid correctpassword and anotherpassword")
	public void i_have_a_valid_correctpassword_and_anotherpassword() {
		System.out.println("Inside Step - user has valid current and new password");
	}

	@When("I open the Edit Details page")
	public void i_open_the_edit_details_page() {
		System.out.println("Inside Step - user opens the edit details page");
	    driver.navigate().to("https://www.shoecarnival.com/profile");
	}

	@And("I enter correctpassword and anotherpassword")
	public void i_enter_correctpassword_and_anotherpassword() {
		System.out.println("Inside Step - user enters current and new password");
		driver.findElement(By.xpath("//input[@name='currentPassword']")).sendKeys("correctpassword");
		driver.findElement(By.xpath("//input[@name='newPassword']")).sendKeys("anotherpassword");
	}

	@And("I confirm anotherpassword")
	public void i_confirm_anotherpassword() {
		driver.findElement(By.xpath("//input[@name='confirmedPassword']")).sendKeys("anotherpassword");
	}

	@And("I click on Apply")
	public void i_click_on_apply() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='MuiBox-root jss1916']//span[@class='MuiButton-label'][normalize-space()='APPLY']")).click();
		Thread.sleep(10000);
	}

	@Then("my password is changed successfully")
	public void my_password_is_changed_successfully() {
		driver.findElement(By.xpath("//h1[@class='MuiBox-root jss1411']")).isDisplayed();
		driver.close();
		driver.quit();
	}

	@Given("I have a valid alsoapassword and mypass12")
	public void i_have_a_valid_alsoapassword_and_mypass12() {
		System.out.println("Inside Step - user has valid current and new password");
	}

	@And("I enter alsoapassword and mypass12")
	public void i_enter_alsoapassword_and_mypass12() {
		System.out.println("Inside Step - user enters current and new password");
		driver.findElement(By.xpath("//input[@name='currentPassword']")).sendKeys("alsoapassword");
		driver.findElement(By.xpath("//input[@name='newPassword']")).sendKeys("mypass12");
	}

	@And("I confirm mypass12")
	public void i_confirm_mypass12() {
		driver.findElement(By.xpath("//input[@name='confirmedPassword']")).sendKeys("mypass12");
	}
}
