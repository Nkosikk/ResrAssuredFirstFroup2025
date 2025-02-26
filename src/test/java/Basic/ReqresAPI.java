package Basic;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReqresAPI {
    public static void main(String[] args) {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }


}
