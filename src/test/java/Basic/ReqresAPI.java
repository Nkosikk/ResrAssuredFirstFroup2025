package Basic;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReqresAPI {
    public static void main(String[] args) {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());

        Response response1 = RestAssured.get("https://reqres.in/api/users/2");
        System.out.println("Response Status Code: " + response1.getStatusCode());
        System.out.println("Response Body: " + response1.getBody().asString());

        Response response2 = RestAssured.get("https://reqres.in/api/unknown/2");
        System.out.println("Response Status Code: " + response2.getStatusCode());
        System.out.println("Response Body: " + response2.getBody().asString());
    }


}
