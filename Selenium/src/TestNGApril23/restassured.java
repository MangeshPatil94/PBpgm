package TestNGApril23;



import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.asynchttpclient.RequestBuilder;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class restassured 
{
	RequestSpecification  reqBuilder;
	
	@BeforeTest
	public void setUp() {		
		 this.reqBuilder = new RequestBuilder()
		.setBaseUri("https://reqres.in/")
		.setBasePath("/api/users").addQueryParam("page", 2).build();
	}

	
	@Test
	public void getRequest1() {	
		
		RestAssured
		  .given().log().all()
		  .spec(reqBuilder)
		   .when().get()
		   .then().log().all()
		   .statusLine("HTTP/1.1 200 OK");		
						
	}
	
	@Test
	public void getRequest() {	
		
		RestAssured.baseURI="https://reqres.in/";
		
		String R=given().log().all().header("Content-Type","application/json").
		when().get("/api/users?page=2").
		then().log().all().assertThat().statusCode(200).body("page",equalTo(2))
		.extract().response().asString();
		
		JsonPath J=new JsonPath(R);
		String r= J.getString("per_page");
		System.out.println(r);
		String r1=J.getString("data[1].id");
		System.out.println(r1);   
				
	}
	
	
	@Test
	public void postRequest() {
		
		RestAssured.baseURI="https://reqres.in/";
		String R=given().log().all().header("Content-Type","application/json").body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}").when().post("/api/users").
		then().log().all().assertThat().statusCode(201)
		.body("name",equalTo("morpheus")).extract().response().asString();	
		System.out.println(R);
		
	}
	
	
	@Test
	public void putRequest() {
	
		RestAssured.baseURI="https://reqres.in/";
		
		String R=given().log().all().header("Content-Type","application/json").body("{\r\n"
				+ "    \"name\": \"Prathemsh\",\r\n"
				+ "    \"job\": \"Tester\"\r\n"
				+ "}").when().put("/api/users/2")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();	
	}
	
	@Test
	public void patchRequest() {
		RestAssured.baseURI="https://reqres.in/";
		String R=given().log().all().header("Content-Type","application/json").body("{\r\n"
				+ "    \"name\": \"Prathmesh\"\r\n"
				+ "    \r\n"
				+ "}").when().patch("/api/users/2")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		
	}
	
	
	@Test
	public void deleteRequest() {
		RestAssured.baseURI="https://reqres.in/";
		
		given().log().all().header("Content-Type","application/json")
		.when().delete("/api/users/2").then().log().all().assertThat().statusCode(204);
		
	}
	
	
	@Test
	public void basicAuthRequst() {
		RestAssured.baseURI="https://postman-echo.com/";
		
		given().log().all().header("Content-Type","application/json").auth().preemptive().basic("postman", "password")
		.when().get("/basic-auth").then().log().all().assertThat().statusCode(200);
			
	}
	
	
	@Test
	public void deleteRequestValidateResponseTime() {
		
		RestAssured.baseURI="https://reqres.in/";
		
		Response R=given().log().all().header("Content-Type","application/json")
		.when().delete("/api/users/2");
		long Rtime=R.getTime();
		System.out.println(Rtime);
		ValidatableResponse Val=R.then().log().all();
		Val.statusCode(204);
		Val.time(Matchers.lessThan(3000L));	
		
	}
	
	
}

