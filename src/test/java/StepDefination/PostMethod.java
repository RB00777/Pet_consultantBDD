package StepDefination;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostMethod {

	RequestSpecification req;
	Response res;
	ValidatableResponse validate;
	
	@Given("User is able to post the data in json format")
	public void user_is_able_to_post_the_data_in_json_format()  {
	    JSONObject obj = new JSONObject();
	    obj.put("address","bhodnsar");
	    obj.put( "email", "ranjaaaaan43@gmail.com");
	    obj.put( "id", 31 );
	    obj.put( "name","ranjanq" );
	    obj.put("otp", 933);
	    obj.put( "password", "saar@311");
	    obj.put( "phone", "8763823309");
	    obj.put( "username", "var4498");
	    req= RestAssured.given()
				.body(obj)
		        .contentType(ContentType.JSON);
	}

	@When("User post the data by using an api is {string}")
	public void user_post_the_data_by_using_an_api_is(String URI)  {
		 res = req.post(URI);
	}

	@Then("User validates the post status code is {int}")
	public void user_validates_the_post_status_code_is(Integer int1){
	    validate = res.then();
	    validate.assertThat().statusCode(int1).log().all();
	}


}
