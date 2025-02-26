package Common;

import io.restassured.response.Response;

import static Common.basePaths.Dogs_BaseURL;
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
    public static Response getListOfAllSubBreedsResponse() {
        return given().
                when().
                contentType("application/json").
                log().all().
                get(Dogs_BaseURL + "/breed/hound/list").
                then().
                log().all().
                extract().response();
    }

}
