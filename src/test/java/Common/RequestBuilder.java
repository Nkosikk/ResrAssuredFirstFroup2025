package Common;

import io.restassured.response.Response;

import org.json.simple.JSONObject;

import static Common.PayloadBuilder.createEmployeeObject;
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

    public static Response getListOfCountriesResponse() {
        return given().
                when().
                contentType("application/json").
                log().all().
                get(basePaths.RestCountries_BaseURL + "/v3.1/all").
                then().
                log().all().
                extract().response();
    }

    public static Response getSingleResourceResponse() {
        return given().
                when().
                contentType("application/json;").
                log().all().
                get(ReqRes_BaseURL + "/unknown/2").
                then().
                log().all().
                extract().response();
    }

    public static Response getSingleUserNotFoundResponse() {
        return given().
                when().
                contentType("application/json").
                log().all().
                get(ReqRes_BaseURL + "/unknown/23").
                then().
                log().all().
                extract().response();
    }

    public static Response postLoginUnsuccessfulResponse(JSONObject loginData) {

        return given().when().
                contentType("application/json").
                body(loginData.toString()).
                post(ReqRes_BaseURL + "/login").
                then().
                log().
                all().
                extract().
                response();
    }

    public static Response getSingleRandomImageResponse(int RandomNumber) {
        return given().
                when().pathParam("RandomNumber", RandomNumber).
                contentType("application/json").relaxedHTTPSValidation().
                log().all().
                get(Dogs_BaseURL + "/breeds/image/random/{RandomNumber}").
                then().
                log().all().
                extract().response();

    }
    public static Response postCreateEmployeeSuccessfulResponse() {



        return given().when().
                contentType("application/json").
                body(createEmployeeObject()).
                        post(ReqRes_BaseURL + "/users").
                        then().
                        log().
                        all().
                        extract().
                        response();


    }
}
