package Tests.OpenWeather;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static Common.CommonTestData.*;
import static Common.RequestBuilder.*;

@Test
@Feature("Weather")
@Story("weather")
public class OpenWeatherTests {

    public void weatherStationStationTests(){
        weatherStationStationResponse().
                then().
                assertThat().
                statusCode(Created_Status_Code);

    }

}
