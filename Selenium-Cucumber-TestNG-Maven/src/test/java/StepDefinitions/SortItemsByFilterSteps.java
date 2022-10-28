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

public class SortItemsByFilterSteps {
	
	WebDriver driver = null;
	
	@Given("that the user clicks on the drop-down box")
	public void that_the_user_clicks_on_the_drop_down_box() {
		
		String projectPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to("https://www.shoecarnival.com/mens/athletics_and_sneakers/running_shoes?page=4");
	    driver.findElement(By.className("ais-SortBy-select")).sendKeys(Keys.ENTER);
	    
	}

	@When("the user selects Best Match")
	public void the_user_selects_best_match() {
		driver.navigate().to("https://www.shoecarnival.com/mens/athletics_and_sneakers/running_shoes?sort=match");
	}

	
	@When("the user selects Price Low-High")
	public void the_user_selects_price_low_high() {
		driver.navigate().to("https://www.shoecarnival.com/mens/athletics_and_sneakers/running_shoes?sort=priceAsc");
	}

	@When("the user selects Price High-Low")
	public void the_user_selects_price_high_low() {
	    driver.navigate().to("https://www.shoecarnival.com/mens/athletics_and_sneakers/running_shoes?sort=priceDesc");
	}

	@When("the user selects New Arrivals")
	public void the_user_selects_new_arrivals() {
	    driver.navigate().to("https://www.shoecarnival.com/mens/athletics_and_sneakers/running_shoes?sort=new");
	}

	@When("the user selects Most Popular")
	public void the_user_selects_most_popular() {
	    driver.navigate().to("https://www.shoecarnival.com/mens/athletics_and_sneakers/running_shoes?sort=popular");
	}

	@When("the user selects Top Rated")
	public void the_user_selects_top_rated() {
	   driver.navigate().to("https://www.shoecarnival.com/mens/athletics_and_sneakers/running_shoes?sort=rating");
	}
	
	@Then("the items in the catalog shall be sorted according to the Best Match")
	public void the_items_in_the_catalog_shall_be_sorted_according_to_the_best_match() {
		if(driver.getCurrentUrl().contentEquals("https://www.shoecarnival.com/mens/athletics_and_sneakers/running_shoes?sort=match"))
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
	
	@Then("the items in the catalog shall be sorted according to the Price Low-High")
	public void the_items_in_the_catalog_shall_be_sorted_according_to_the_price_low_high() {
		if(driver.getCurrentUrl().contentEquals("https://www.shoecarnival.com/mens/athletics_and_sneakers/running_shoes?sort=priceAsc"))
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
	
	@Then("the items in the catalog shall be sorted according to the Price High-Low")
	public void the_items_in_the_catalog_shall_be_sorted_according_to_the_price_high_low() {
		if(driver.getCurrentUrl().contentEquals("https://www.shoecarnival.com/mens/athletics_and_sneakers/running_shoes?sort=priceDesc"))
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
	
	@Then("the items in the catalog shall be sorted according to the New Arrivals")
	public void the_items_in_the_catalog_shall_be_sorted_according_to_the_new_arrivals() {
		if(driver.getCurrentUrl().contentEquals("https://www.shoecarnival.com/mens/athletics_and_sneakers/running_shoes?sort=new"))
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
	
	@Then("the items in the catalog shall be sorted according to the Most Popular")
	public void the_items_in_the_catalog_shall_be_sorted_according_to_the_most_popular() {
		if(driver.getCurrentUrl().contentEquals("https://www.shoecarnival.com/mens/athletics_and_sneakers/running_shoes?sort=popular"))
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
	
	@Then("the items in the catalog shall be sorted according to the Top Rated")
	public void the_items_in_the_catalog_shall_be_sorted_according_to_the_top_rated() {
		if(driver.getCurrentUrl().contentEquals("https://www.shoecarnival.com/mens/athletics_and_sneakers/running_shoes?sort=rating"))
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
