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


    public static Response getAllResourcesListedResponse() {
        return given().
                when().
                contentType("application/json").
                log().all().
                get(ReqRes_BaseURL + "/unknown/").
                then().
                log().all().
                extract().response();
    }
}
