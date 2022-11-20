package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class invalidcoupon {
	WebDriver driver = null;
	
	@SuppressWarnings("deprecation")
	@Given("the cart is not empty")
	public void the_cart_is_not_empty() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	    driver.navigate().to("https://www.shoecarnival.com/nike_elemental_backpack/93605.html?color=265683");
	    
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[10]/button[1]/span[1]"));
		search.click();
	}

	@SuppressWarnings("deprecation")
	@And("the user is on the Cart page")
	public void the_user_is_on_the_cart_page() {
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.navigate().to("https://www.shoecarnival.com/cart");
	}

	@SuppressWarnings("deprecation")
	@When("the user adds the FLAT50")
	public void the_user_adds_the_flat50() {
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("FLAT50");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement add = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[1]/div[4]/div[1]/div[1]/div[2]/button[1]/span[1]"));
		add.click();
	}
	
	@SuppressWarnings("deprecation")
	@When("the user adds the null")
	public void the_user_adds_the_null() {
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		WebElement add = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[1]/div[4]/div[1]/div[1]/div[2]/button[1]/span[1]"));
		add.click();
	}

	@SuppressWarnings("deprecation")
	@Then("the user gets an Coupon code FLAT50 cannot currently be added to your cart.")
	public void the_user_gets_an_coupon_code_flat50_cannot_currently_be_added_to_your_cart() {
	    
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		if(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]")).getText().equals(""))
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

	

	@SuppressWarnings("deprecation")
	@Then("the user gets an Please enter a coupon code.")
	public void the_user_gets_an_please_enter_a_coupon_code() {
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		if(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]")).getText().equals(""))	
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
	
}