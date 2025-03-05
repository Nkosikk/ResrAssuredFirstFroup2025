package Common;

import io.restassured.response.Response;

import static Common.BasePaths.Dogs_BaseURL;
import static io.restassured.RestAssured.given;

public class RequestBuilder {
    public static Response GetListOfAllBreeds(){
        return given().
                when().
                contentType("application/json").
                log().all().
                get(Dogs_BaseURL+"/breeds/list/all").
                then().
                log().all().
                extract().response();
    }
}
