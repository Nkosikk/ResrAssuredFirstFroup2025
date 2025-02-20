import io.restassured.RestAssured;
import io.restassured.response.Response;

public class WeatherStation {
    public static void main(String[] args) {
        Response response = RestAssured.get("https://api.weather.gov/stations");
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
        // Add your code here
    }
}
