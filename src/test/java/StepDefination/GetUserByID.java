package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetUserByID {
	
	 Response res;
	 ValidatableResponse validate ;
	@When("User is able to Retrieve details by using an Api is {string}")
	public void user_is_able_to_retrieve_details_by_using_an_api_is(String uri) {
	    res = RestAssured.get(uri);
	}

	@Then("User Validate the Status code of get all user {int}")
	public void user_validate_the_status_code_of_get_all_user(Integer int4) {
	     validate = res.then();
	    validate.assertThat().statusCode(int4).log().all();
	}

}
