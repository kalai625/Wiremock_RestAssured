import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class MockServer {

    @Test
    public void standAlone() {
        Response response = RestAssured.given().get("http://localhost:8080/subcription").then().statusCode(200).extract().response();
//        System.out.println(response.asString());
//        System.out.println(response)
    }

    @Test
    public void docker() {
        Response response = RestAssured.given().get("http://localhost:9090/v1/location").then().statusCode(200).extract().response();
//        System.out.println(response.asString());
    }

}

