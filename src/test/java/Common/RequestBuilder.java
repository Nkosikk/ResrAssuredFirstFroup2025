package Common;

import io.restassured.response.Response;

import static Common.basePaths.Dogs_BaseURL;
import static Common.basePaths.ReqRes_BaseURL;
import static io.restassured.RestAssured.given;

public class RequestBuilder {


    public static Response getListOfAllBreedsResponse() {
        return given().
                when().
                contentType("application/json").
                log().all().
                get(Dogs_BaseURL + "/breeds/list/all").
                then().
                log().all().
                extract().response();
    }

    public static Response getDelayedResponse() {
        return given().
                when().
                contentType("application/json").
                log().all().
                get(ReqRes_BaseURL + "/api/users?delay=3").
                then().
                log().all().
                extract().response();
    }

    public static Response getListOfSuccessfulRegistrationsResponse() {

        String requestBody = "{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"pistol\"\n" +
                "}";

        return given().
                contentType("application/json").
                body(requestBody).
                when().
                post(ReqRes_BaseURL + "/api/register").
                then().
                log().all().
                extract().response();
    }

}
