import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;

public class RegresAPI {
    public static void main(String[] args) {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());

        // Verify that the status code is 200
        response.then().assertThat().statusCode(200);

        // Verify that first_name is Michael
        verifyFirstNameIsMichael(response);
    }

    public static void verifyFirstNameIsMichael(Response response) {
        response.then().assertThat().body("data[0].first_name", equalTo("Michael"));
    }


}
