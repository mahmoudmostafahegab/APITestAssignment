package test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Api_Test {

@Test
	public void test_01()
	{


Response response = RestAssured.get("https://jsonplaceholder.typicode.com/users").then().assertThat().statusCode(200).extract().response();
String responseInString = response.asString();
System.out.println(responseInString);


JsonPath jsonPath = new JsonPath(responseInString);

String emailAddress = jsonPath.getString("email");
System.out.println(emailAddress);


	}
}
