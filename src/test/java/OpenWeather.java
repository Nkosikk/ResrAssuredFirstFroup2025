import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OpenWeather {
    public static void main(String[] args) {
        String apiKey = "cf4dced3a237d81d607ad2009cc5e15a";
        Response response = RestAssured.given()
                .queryParam("appid", apiKey)
                .get("http://api.openweathermap.org/data/3.0/stations");
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }
}