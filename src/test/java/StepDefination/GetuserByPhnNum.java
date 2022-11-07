package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetuserByPhnNum {

	 Response res;
	 ValidatableResponse validate ;


@When("user  retrieve  the Phone Number by using an API is {string}")
public void user_retrieve_the_phone_number_by_using_an_api_is(String uri1) {
	 res = RestAssured.get(uri1);
}

@Then("User validate status code of get user by phone number {int}")
public void user_validate_status_code_of_get_user_by_phone_number(Integer code) {
	 validate = res.then();
	    validate.assertThat().statusCode(code).log().all();
}
}