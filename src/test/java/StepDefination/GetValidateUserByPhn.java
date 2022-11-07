package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetValidateUserByPhn {
	Response res ;
	ValidatableResponse validate;
	
	@When("user  validating  the Phone Number by using an API is {string}")
	public void user_validating_the_phone_number_by_using_an_api_is(String url) {
	    Response res = RestAssured.get(url);
	    
	}

	@Then("User get status code of validate user by phone number {int}")
	public void user_get_status_code_of_validate_user_by_phone_number(Integer int2) {
	   validate = res.then();
	   validate.assertThat().statusCode(int2).log().all();
	}

}
