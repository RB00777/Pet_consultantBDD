package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetUserByEmail {
	Response res;
	ValidatableResponse validate;
	@When("User is able to retrieve email by using URI  is {string}")
	public void user_is_able_to_retrieve_email_by_using_uri_is(String url) {
	    res = RestAssured.get(url); 
	}

	@Then("User validate the status code  {int}")
	public void user_validate_the_status_code(Integer int3) {
	     validate = res.then();
	     validate.assertThat().statusCode(int3).log().all();
	}

}
