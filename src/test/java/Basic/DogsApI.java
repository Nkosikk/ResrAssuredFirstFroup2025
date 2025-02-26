package Basic;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.notNullValue;

public class DogsApI {
    public static void main(String[] args) {
        Response response = RestAssured.get("https://dog.ceo/api/breeds/list/all");
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());

        // Verify that the status code is 200
        response.then().assertThat().statusCode(200);

        // Verify that "doberman" is in the list
        response.then().assertThat().body("message.doberman", notNullValue());

        Response response2 = RestAssured.get("https://dog.ceo/api/breeds/image/random");
        System.out.println("Response Status Code: " + response2.getStatusCode());
        System.out.println("Response Body: " + response2.getBody().asString());

        // Verify that the status code is 200
        response2.then().assertThat().statusCode(200);

        // Verify that the message is not null
        response2.then().assertThat().body("message", notNullValue());

        Response response3 = RestAssured.get("https://dog.ceo/api/breeds/image/random/3");
        System.out.println("Response Status Code: " + response3.getStatusCode());
        System.out.println("Response Body: " + response3.getBody().asString());

        // Verify that the status code is 200
        response3.then().assertThat().statusCode(200);

        // Verify that the message is not null
        response3.then().assertThat().body("message", notNullValue());

        Response response4 = RestAssured.get("https://dog.ceo/api/breed/hound/list");
        System.out.println("Response Status Code: " + response4.getStatusCode());
        System.out.println("Response Body: " + response4.getBody().asString());

        // Verify that the status code is 200
        response4.then().assertThat().statusCode(200);

        // Verify that "afghan" is in the list
       // response4.then().assertThat().body("message.afghan", notNullValue());


    }
}
