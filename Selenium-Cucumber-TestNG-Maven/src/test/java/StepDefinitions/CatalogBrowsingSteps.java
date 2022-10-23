package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CatalogBrowsingSteps {
	@Given("that user is in a catalog")
	public void that_user_is_in_a_catalog() {
	    System.out.println("I am in the Catalog");
	}

	@When("the user clicks on the Single Arrow Forward")
	public void the_user_clicks_on_the_Single_Arrow_Forward() {
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
