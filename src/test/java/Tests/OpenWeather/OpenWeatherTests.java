package Tests.OpenWeather;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static Common.CommonTestData.*;
import static Common.RequestBuilder.*;
import static Common.RequestBuilder.weatherStationStationResponse;
import static Common.TestDataCreation.*;
import static org.hamcrest.Matchers.containsString;


@Test
@Feature("Weather")
@Story("weather")
public class OpenWeatherTests {


    public void createWeatherStationStationWithEmptyExternalIDTests(){
        weatherStationStationResponse("",first_name,randomLatitude,randomLongitude,randomAltitude).
                then().
                assertThat().
                statusCode(Bad_Request_Status_Code).
                body("message",containsString("Bad external id"));

    }
    public void createWeatherStationStationWithEmptyNameTests(){
        weatherStationStationResponse(randomEmployeeId,"",randomLatitude,randomLongitude,randomAltitude).
                then().
                assertThat().
                statusCode(Bad_Request_Status_Code);

    }
//need to correct longitude,latutitude and altitude to be empty values
    public void createWeatherStationStationWithEmptyLatitudeTests() {
        weatherStationStationResponse(randomEmployeeId, first_name,  4.55, randomLongitude, randomAltitude).
                then().
                assertThat().
                statusCode(Bad_Request_Status_Code);
    }

    public void createWeatherStationStationWithEmptyLongitudeTests(){
        weatherStationStationResponse(randomEmployeeId,first_name,randomLatitude,2.33,randomAltitude).
                then().
                assertThat().
                statusCode(Bad_Request_Status_Code);

    }

    public void createWeatherStationStationWithEmptyAltitudeTests() {
        weatherStationStationResponse(randomEmployeeId, first_name, randomLatitude, randomLongitude,0).
                then().
                assertThat().
                statusCode(Bad_Request_Status_Code);
    }

    public void weatherStationStationTests(){
        weatherStationStationResponse(randomEmployeeId,first_name,randomLatitude,randomLongitude,randomAltitude).
                then().
                assertThat().
                statusCode(Created_Status_Code);
    }

    @Test(dependsOnMethods = "weatherStationStationTests")
    public void getWeatherStationStationTests(){
        getWeatherStationStationResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code);
    }



}
