package APITesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class ReqResAPIs {
	
		//@Test
		public void sohaibsAPItestDemo1() //get and then
		{
			baseURI = "https://reqres.in/api";
			
			given().
				get("/users/2").
				then().
				statusCode(200).
				body("data.id",equalTo(2))
				.log().all();
			
			System.out.println(get("/users/2").getStatusCode());
			System.out.println(get("/users/2").getTime());
			System.out.println(get("/users/2").asString());
			
		}
		
		//@Test
		public void sohaibsAPItestDemo2() //get and post //post is for creating resource
		{
			JSONObject request = new JSONObject();
			request.put("name", "Sohaib");
			request.put("job", "Ambassador");
			
			System.out.println(request.toJSONString());
			
			baseURI = "https://reqres.in/api";
			
			given().
				body(request.toJSONString()).
				when().
				post("/users").
				then().
				statusCode(201)
				.log().all();
		}
		
		//@Test
		public void sohaibsAPItestDemo3() //put //put checks if resource exists and then updates or else creates new
		{
			JSONObject request = new JSONObject();
			request.put("name", "Sohaib");
			request.put("job", "Ambassador");
			
			System.out.println(request.toJSONString());
			
			baseURI = "https://reqres.in/api";
			
			given().
				body(request.toJSONString()).
				when().
				put("/users/2").
				then().
				statusCode(200)
				.log().all();
		}
		
		//@Test
		public void sohaibsAPItestDemo4() //patch //patch is for updating a resource
		{
			JSONObject request = new JSONObject();
			request.put("name", "Sohaib");
			request.put("job", "FRAG GAMES");
			
			System.out.println(request.toJSONString());
			
			baseURI = "https://reqres.in";
			
			given().
				body(request.toJSONString()).
				when().
				patch("api/users/2").
				then().
				statusCode(200)
				.log().all();
			
			
		}
		
		//@Test
		public void sohaibsAPItestDemo5() //delete
		{
			
			baseURI = "https://reqres.in";
			
				when().
				delete("api/users/2").
				then().
				statusCode(204)
				.log().all();
			
			
		}
		
		

		
		
		
		
}
