package Common;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static Common.basePaths.DogURL;
import static io.restassured.RestAssured.given;

public class RequestBuilder {
    public static Response getListsOfAllBreeds() {
        return given().
                when().
                contentType("application/json").
                log().
                all().get(DogURL + "/breeds/list/all").
                then().
                log().all().
                extract().response();

    }
}
