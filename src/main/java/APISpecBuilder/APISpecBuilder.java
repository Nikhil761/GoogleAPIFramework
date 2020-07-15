package APISpecBuilder;
import java.io.IOException;
import Base.TestBase;
import ExcelUtils.Utils;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class APISpecBuilder extends TestBase{



	public static RequestSpecification requestSpecificationPostGoogleAPI() {
		RequestSpecification request=new io.restassured.builder.RequestSpecBuilder().setBaseUri(baseURI()).addQueryParam("key", getKey()).setContentType(ContentType.JSON).build();
		return request;
    		}
	public static ResponseSpecification responseSpecificationPostGoogleAPI() throws IOException {
		ResponseSpecification response=new io.restassured.builder.ResponseSpecBuilder().expectStatusCode(Utils.getStatusCodePostAPI()).expectContentType(ContentType.JSON).expectHeader("Server", "Apache/2.4.18 (Ubuntu)").build();
		return response;

	}
	
	public static RequestSpecification requestSpecificationGetGoogleAPI() {
		RequestSpecification request=new io.restassured.builder.RequestSpecBuilder().setBaseUri(baseURI()).addQueryParam("key", getKey()).setContentType(ContentType.JSON).build();
		return request;
    		}

	public static ResponseSpecification responseSpecificationGetGoogleAPI() throws IOException {
		ResponseSpecification response=new io.restassured.builder.ResponseSpecBuilder().expectStatusCode(Utils.getStatusCodeGetAPI()).expectContentType(ContentType.JSON).expectHeader("Server", "Apache/2.4.18 (Ubuntu)").build();
		return response;

	}
	
}