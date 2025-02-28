package listrec;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Listreq {
    public static void main(String[] args) {
        getUsers();
    }

    public static void getUsers() {
        RestAssured.baseURI = BASE_URL;
        RequestSpecification request = RestAssured.given();

        Response response = request.get("/users?page=1");

}













