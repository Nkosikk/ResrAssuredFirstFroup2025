package Tests.OpenWeather;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import javax.swing.*;

import static Common.CommonTestData.*;
import static Common.RequestBuilder.*;
import static Common.TestDataCreation.randomEmployeeId;
import static org.hamcrest.Matchers.containsString;

@Test
@Feature("Weather")
@Story("weather")
public class OpenWeatherTests {


    public void ceateWeatherStationStationWithEmptyExternalIDTests(){
        weatherStationStationResponse("","Nkosi weather station",36.17,20.12,150).
                then().
                assertThat().
                statusCode(Bad_Request_Status_Code).
                body("message",containsString("Bad external id"));

    }
    public void ceateWeatherStationStationWithEmptyNameTests(){
        weatherStationStationResponse(randomEmployeeId,"",36.17,20.12,150).
                then().
                assertThat().
                statusCode(Bad_Request_Status_Code);

    }
    public void weatherStationStationTests(){
        weatherStationStationResponse(randomEmployeeId,"Nkosi weather station",36.17,20.12,150).
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
