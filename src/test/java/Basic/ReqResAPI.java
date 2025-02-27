package Basic;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class ReqResAPI {

    public static void main(String[] args) {
        Response response = RestAssured.get("https://reqres.in/api/unknown/");
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());

        // Verify that the status code is 200
        response.then().assertThat().statusCode(200);



    }
}
