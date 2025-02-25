package Tests.Countries;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static Common.CommonTestData.Success_Status_Code;
import static Common.RequestBuilder.getListOfAllCountriesResponse;
import static Common.basePaths.Countries_BaseURL;
import static io.restassured.RestAssured.given;

public class COuntriesTests {

    //ToDO Kelebogile - get countries
    //ToDO Kgaugelo - get countries - do a test to validate south african sign language is included in the list of official language
    //first get the list of all countries
    @Test
     public void getListOfAllCountriesTests() {
         getListOfAllCountriesResponse().
                 then().
                 assertThat().
                 statusCode(Success_Status_Code);
     }



    //ToDO Mapitsi - get countries -do a test to validate south africa is in the list
}
