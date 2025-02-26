import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestCountriesTest {

    public static void main(String[] args) {
        Response response = RestAssured.get("https://restcountries.com/v3.1/all");
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
        System.out.println("Response Time: " + response.getTime()); //maybe remove this later
    }
}
