package Basic;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.lessThan;

public class DogsApI {
    public static void main(String[] args) {
        Response response = RestAssured.get("https://dog.ceo/api/breeds/list/all");
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());

        // Verify that the status code is 200
        response.then().assertThat().statusCode(200);

        // Verify that "doberman" is in the list
        response.then().assertThat().body("message.doberman", notNullValue());

        // Verify that "pitbull" is in the list
        response.then().assertThat().body(containsString("pitbull"));

        // Validate that "clumber" is in the list
        response.then().assertThat().body("message.clumber", notNullValue());

        // Verify that response time is less than 200ms
        response.then().assertThat().time(lessThan(200L));
    }
}
