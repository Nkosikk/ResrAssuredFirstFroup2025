import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class Regress_CreateUser {
    public static void main(String[] args) {
        String requestBody = "{ \"name\": \"morpheus\", \"job\": \"leader\" }";

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post("https://reqres.in/api/users");

        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());

        // Verify that the status code is 201
        response.then().assertThat().statusCode(201);

        // Verify that the data added to the database is correct
        response.then().assertThat().body("name", equalTo("morpheus"));
        response.then().assertThat().body("job", equalTo("leader"));
        response.then().assertThat().body("id", notNullValue());

        // Verify that the name is morpheus
        verifyNameIsMorpheus(response);

        //verify that the job is leader
        verifyJobIsLeader(response);

        // Verify that the id is not null
        verifyIdIsNotNull(response);
    }

    public static void verifyNameIsMorpheus(Response response) {
        response.then().assertThat().body("name", equalTo("morpheus"));
    }
    public static void verifyJobIsLeader(Response response) {
        response.then().assertThat().body("job", equalTo("leader"));
    }
    public static void verifyIdIsNotNull(Response response) {
        response.then().assertThat().body("id", notNullValue());
    }
}
