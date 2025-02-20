import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;

public class Regress_PatchUser {
    public static void main(String[] args) {
        String requestBody = "{ \"name\": \"Denzel\", \"job\": \"QA Team Lead\" }";

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .patch("https://reqres.in/api/users/2");

        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());

        // Verify that the status code is 200
        response.then().assertThat().statusCode(200);

        // Verify that the data updated in the database is correct
        response.then().assertThat().body("name", equalTo("Denzel"));
        response.then().assertThat().body("job", equalTo("QA Team Lead"));
    }
}
