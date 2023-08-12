package userregistrationsteps;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistraionSteps {

	
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
      
	     System.out.println("user navigates on registraion page");	
	}

	@When("User enters following details")
	public void user_enters_following_details(DataTable dataTable) {
   
		List<List<String>>userList = dataTable.asLists(String.class);
		
		for(List<String> e: userList) {
			System.out.println(e);
		}
	}

	@Then("user registration should be successful")
	public void user_registration_should_be_successful() {

	}

}
