package Common;

import io.restassured.response.Response;

import static Common.BasePaths.Dogs_BaseURL;
import static Common.BasePaths.Reqres_BaseURL;
import static io.restassured.RestAssured.given;

public class RequestBuilder {
    public static Response getListOfAllBreedsResponse(){
        return given().
                when().
                contentType("application/json").
                log().all().
                get(Dogs_BaseURL+ "/breeds/list/all").
                then().
                log().all().
                extract().response();
    }

    public static Response getBreedImagesResponse(String breed){
        return given().
                when().
                contentType("application/json").
                log().all().
                get(Dogs_BaseURL+ "/breed/"+breed+"/images").
                then().
                log().all().
                extract().response();
    }

    public static Response getListOfUsersResponse(){
        return given().
                when().
                contentType("application/json").
                log().all().
                get(Reqres_BaseURL + "/users?page=2").
                then().
                log().all().
                extract().response();
    }

    public static Response getSingleResourceResponse(){
        return given().
                when().
                contentType("application/json").
                log().all().
                get(Reqres_BaseURL + "/unknown/2").
                then().
                log().all().
                extract().response();
    }
}
