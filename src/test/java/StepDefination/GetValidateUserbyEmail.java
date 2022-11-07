package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetValidateUserbyEmail {
	 Response res;
	 ValidatableResponse validate;
	 
	@When("User is Able to Retrieve email by using an URI is {string}")
	public void user_is_able_to_retrieve_email_by_using_an_uri_is(String url) {
	      res = RestAssured.get(url);
	}

	@Then("User Validate the Status code for get Email {int}")
	public void user_validate_the_status_code_for_get_email(Integer int6) {
	     validate = res.then();
	    validate.assertThat().statusCode(int6).log().all();
	}


}
