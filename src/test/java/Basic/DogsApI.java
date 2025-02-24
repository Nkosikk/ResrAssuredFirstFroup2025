package Basic;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.notNullValue;

public class DogsApI {
    public static void main(String[] args) {
        Response response = RestAssured.get("https://dog.ceo/api/breeds/list/all");
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
//test
        // Verify that the status code is 200
        response.then().assertThat().statusCode(200);

        // Verify that "doberman" is in the list
        response.then().assertThat().body("message.doberman", notNullValue());
    }
}
