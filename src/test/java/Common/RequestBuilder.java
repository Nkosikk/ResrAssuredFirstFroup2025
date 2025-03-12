package Common;

import io.restassured.response.Response;

import org.json.simple.JSONObject;

import static Common.PayloadBuilder.*;
import static Common.basePaths.*;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class RequestBuilder {

    public static String stationID;


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

    public static Response postLoginUncussessful(){

        return given().
                when().
                contentType("application/json").
                body(unsuccessfulLogin()).
                log().all().
                post(ReqRes_BaseURL + "/login").
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

    public static Response postLoginUnsuccessfulResponse() {

        return given().when().
                contentType("application/json").
                body(loginWithEmailOnly()).
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

    public static Response weatherStationStationResponse(String external_id, String name,double latitude,double longitude,int altitude){
        Response response = given().
                queryParam("appid","cf4dced3a237d81d607ad2009cc5e15a").
                when().
                body(weatherStationStationObject(external_id,name,latitude,longitude,altitude)).
                contentType("application/json").
                log().all().
                post(Weather_BaseURL+"/data/3.0/stations").
                then().
                log().all().
                extract().response();
        stationID = response.jsonPath().getString("ID");

        return response;
    }

    public static Response getWeatherStationStationResponse(){
        return given().
                queryParam("appid","cf4dced3a237d81d607ad2009cc5e15a").
                when().
                contentType("application/json").
                log().all().
                get(Weather_BaseURL+"/data/3.0/stations"+"/"+stationID).
                then().
                log().all().
                extract().response();



    }
}
