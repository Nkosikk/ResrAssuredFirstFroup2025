package DogsApi;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DisplayImage {
    public static void main(String[] args) {
        Response response = RestAssured.get("https://dog.ceo/api/breeds/image/random");
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());

        // Verify that the status code is 200
        response.then().assertThat().statusCode(200);
    }
}
