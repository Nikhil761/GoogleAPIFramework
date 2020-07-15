package Test;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import java.io.IOException;
import org.testng.annotations.Test;
import APISpecBuilder.APISpecBuilder;
import Base.TestBase;
import ExcelUtils.Utils;


public class GoogleAPI extends TestBase {
	

	@Test
	public void postGoogleAPI() throws Exception {

		RequestSpecification req = given().spec(APISpecBuilder.requestSpecificationPostGoogleAPI())
				.body(Utils.addPlacePayload());
		Response res = req.when().post(Utils.getResourcePostAPI()).then().assertThat()
				.spec(APISpecBuilder.responseSpecificationPostGoogleAPI()).extract().response();
		String responseString = res.asString();

		// Taking string as a input and convert into json. Parsing json response
		JsonPath js = new JsonPath(responseString);
		String placeid = js.getString("place_id");		

	}

	@Test
	public void getGoogleAPI() throws IOException {
		RequestSpecification req = given().spec(APISpecBuilder.requestSpecificationPostGoogleAPI())
				.body(Utils.addPlacePayload());
		Response res = req.when().post(Utils.getResourcePostAPI()).then()
				.spec(APISpecBuilder.responseSpecificationPostGoogleAPI()).extract().response();
		String responseString = res.asString();

		// Taking string as a input and convert into json. Parsing json response
		JsonPath js = new JsonPath(responseString);
		String placeid = js.getString("place_id");		

		given().queryParam("place_id", placeid).spec(APISpecBuilder.requestSpecificationGetGoogleAPI())
		.when().get(Utils.getResourceGetAPI()).then().assertThat().spec(APISpecBuilder.responseSpecificationGetGoogleAPI());
	}

}
/*
 * if(response.contains(placeid)) { for (int i=0;i<10;i++) {
 * 
 * 
 * RestAssured.baseURI="https://rahulshettyacademy.com";
 * 
 * String
 * response2=given().queryParam("key","qaclick123").header("Content-Type",
 * "application/json")
 * .body(PostGoogleAPIPayoad.addPlace()).when().log().all().post(
 * "/maps/api/place/add/json")
 * .then().assertThat().log().all().statusCode(200).body("scope",
 * equalTo("APP")) .header("Server", equalTo("Apache/2.4.18 (Ubuntu)"))
 * .extract().response().asString();
 * 
 * JsonPath js2=new JsonPath(response2); String
 * placeid2=js2.getString("place_id");
 * System.out.println("Response for loop number :" +i+
 * "Created place id is "+placeid2); } }
 */
/*
 * int i = 0;
 * 
 * while (response.contains(placeid)) {
 * 
 * RestAssured.baseURI = baseURI();
 * 
 * String response2 = given().queryParam("key", getKey()).header("Content-Type",
 * getContentType())
 * .body(Utils.addPlacePayload()).when().log().all().post(Utils.getResource()).
 * then()
 * .assertThat().log().all().statusCode(Utils.getStatusCode()).body("scope",
 * equalTo("APP")) .header("Server",
 * equalTo("Apache/2.4.18 (Ubuntu)")).extract().response().asString();
 * 
 * JsonPath js2 = new JsonPath(response2); String placeid2 =
 * js2.getString("place_id"); System.out.println("Response for loop number :" +
 * i + "Created place id is " + placeid2); i++; }
 */
// get API
/*
 * given().queryParam("place_id", placeid).queryParam("key", "qaclick123")
 * .header("Content-Type",
 * "application/json").when().get("/maps/api/place/get/json") // equal to will
 * work only hamcrest class is imported
 * .then().assertThat().log().all().statusCode(200).body("name",
 * equalTo("Frontline house"));
 * 
 * // }
 */
