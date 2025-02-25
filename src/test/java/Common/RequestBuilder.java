package Common;

import io.restassured.response.Response;

import static Common.basePaths.Countries_BaseURL;
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
//get a list of all countries first
    public static Response getListOfAllCountriesResponse() {
        return given().
                when().
                contentType("application/json").
                log().all().
                get(Countries_BaseURL + "/all").then().
                log().all().
                extract().response();

    }
    //validate that south african language is included in the list of official languages
    public static Response getSouthAfricaResponse() {
        return given().
                when().
                contentType("application/json").
                log().all().
                get(Countries_BaseURL + "/name/South Africa").
                then().
                log().all().
                extract().response();
    }
    //validate that Tswana language is included in the list of official languages for South Africa
}
