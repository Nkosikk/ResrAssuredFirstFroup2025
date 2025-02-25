package Tests.Countries;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static Common.CommonTestData.Success_Status_Code;
import static Common.RequestBuilder.getListOfAllCountriesResponse;

import static Common.RequestBuilder.getSouthAfricaResponse;
import static org.hamcrest.Matchers.hasItem;


public class COuntriesTests {

    //ToDO Kelebogile - get countries
    //ToDO Kgaugelo - get countries - do a test to validate south african sign language is included in the list of official language
    //first get the list of all countries
    @Test
    @Feature("Countries API")
    @Story("List of countries")
    @Description("Get all countries")
    public void getListOfAllCountriesTests() {
        getListOfAllCountriesResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code);

    }
    @Test
    @Description("Validate that South Africa is included in the list of countries")
    //validate that south african is included in the list of countries
    public void validateSouthAfricaIsIncludedInListOfCountries(){
        getSouthAfricaResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code);




        //ToDO Mapitsi - get countries -do a test to validate south africa is in the list
    }
}
