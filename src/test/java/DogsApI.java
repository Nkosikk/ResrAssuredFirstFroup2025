import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.notNullValue;

public class DogsApI {
    public static void main(String[] args) {
        getAllBreeds();
        getRandomDogImage();
        getbyBreed();
        getListAssSubBreed();
        getBreedsList();
    }

    public static void getAllBreeds() {
        Response response = RestAssured.get("https://dog.ceo/api/breeds/list/all");
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
        // Verify that the status code is 200
        response.then().assertThat().statusCode(200);

        // Verify that "doberman" is in the list
        response.then().assertThat().body("message.doberman", notNullValue());
    }

    public static void getRandomDogImage() {
        Response response = RestAssured.get("https://dog.ceo/api/breeds/image/random");
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
        // Verify that the status code is 200
        response.then().assertThat().statusCode(200);

        // Verify that the image URL is not null
        response.then().assertThat().body("message", notNullValue());
    }
    public static void getbyBreed(){
        Response response = RestAssured.get("https://dog.ceo/api/breed/hound/images");
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
        // Verify that the status code is 200
        response.then().assertThat().statusCode(200);

    }
    public static void getListAssSubBreed(){
        Response response = RestAssured.get("https://dog.ceo/api/breed/hound/list");
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
        // Verify that the status code is 200
        response.then().assertThat().statusCode(200);

    }
    public static void getBreedsList(){
        Response response = RestAssured.get("https://dog.ceo/api/breed/affenpinscher/images/random");
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
        // Verify that the status code is 200
        response.then().assertThat().statusCode(200);

    }
}