package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllUser {
	 Response res;
	 ValidatableResponse validat;
	 
	 
	@When("User is able to retrieve details by using an URI is {string}")
	public void user_is_able_to_retrieve_details_by_using_an_uri_is(String url) {
	     res = RestAssured.get(url);
	}

	@Then("User validate the Status Code of get all user {int}")
	public void user_validate_the_status_code_of_get_all_user(Integer int2) {
	    ValidatableResponse validat = res.then();
	    validat.assertThat().statusCode(int2).log().all();
	    
	}
}
