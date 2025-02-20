/*import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.notNullValue;

public class OpenWeather {
    public static void main(String[] args) {


        Response response = RestAssured.get("http://api.openweathermap.org");
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());

        // Verify that the status code is 200
        response.then().assertThat().statusCode(200);

        // Verify that "Michael" is in the list
        response.then().assertThat().body("data.find{it.name == 'FirstGroup2025 Test Station'}", notNullValue());
    }
}*/

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.http.ContentType;

public class OpenWeather {
    public static void main(String[] args) {
        String requestBody = "{\n" +
                "  \"external_id\": \"SF_TEST001\",\n" +
                "  \"name\": \"San Francisco Test Station\",\n" +
                "  \"latitude\": 37.76,\n" +
                "  \"longitude\": -122.43,\n" +
                "  \"altitude\": 150\n" +
                "}";

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post("http://api.openweathermap.org/data/3.0/stations");

        System.out.println("Response Body: " + response.getBody().asString());

        // Verify that the status code is 201 (Created)
        response.then().assertThat().statusCode(201);
    }
}