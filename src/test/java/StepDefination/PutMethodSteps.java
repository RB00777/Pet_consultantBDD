package StepDefination;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PutMethodSteps {

	 RequestSpecification req;
	 Response res;
	 ValidatableResponse validate;
	@Given("User is able to update the data in json format")
	public void user_is_able_to_update_the_data_in_json_format() {
		JSONObject obj = new JSONObject();
		
		obj.put("address","bnrnp");
		obj.put("email" ,"jhjkjfk@gmail.com");
		obj.put("id", 76);
		obj.put("name","brhkjkrfkjf");
		obj.put( "otp", 4567);
		obj.put("password","jnj@001");
		obj.put("phone","6370998667");
	    obj.put("username","njjissjs");
	    
	    req = RestAssured.given()
	    .contentType(ContentType.JSON)
	    .body( obj);
	}

	@When("User update the data by using an api is {string}")
	public void user_update_the_data_by_using_an_api_is(String URI) {
		 res = req.put(URI);
	}

	@Then("User validates the update status code is {int}")
	public void user_validates_the_update_status_code_is(Integer code) {
		 validate = res.then();
	     validate.assertThat().statusCode(code).log().all();
	}
}
