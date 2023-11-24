import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class MockServer {

    @Test
    public void lightHouse() {
//		RestAssured.given().get("http://localhost:8080/user/1").then().assertThat().statusCode(200).extract().response();
//		System.out.println();

        Response response = RestAssured.given().get("http://localhost:8080/user/1").then().statusCode(200).extract().response();
        System.out.println(response.asString());
    }

    @Test
    public void ursula() {
        Response response = RestAssured.given().get("http://localhost:8080/user/2").then().statusCode(200).extract().response();
        System.out.println(response.asString());
    }

    @Test
    public void mockServer() {
        Response response = RestAssured.given().get("http://localhost:8080/user/3").then().statusCode(200).extract().response();
        System.out.println(response.asString());
    }

}

