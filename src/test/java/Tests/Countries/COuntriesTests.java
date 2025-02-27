package Tests.Countries;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static Common.CommonTestData.Success_Status_Code;
import static Common.RequestBuilder.getListOfCountriesResponse;
import static org.hamcrest.Matchers.hasItem;

@Test
@Feature("RestCounties API")
@Story("List of countries")
public class COuntriesTests {

    @Description("As an api user i want to see all the countries list")
    @Severity(SeverityLevel.BLOCKER)
    public void getListOfCountriesTests() {
        getListOfCountriesResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code);
    }

    @Description("Validate that South Africa is in the list of countries")
    @Severity(SeverityLevel.CRITICAL)
    public void validateSouthAfricaInList() {
        getListOfCountriesResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code).
                body("name.common", hasItem("South Africa"));
    }

    //ToDO Kelebogile - get countries
    //ToDO Kgaugelo - get countries - do a test to validate south african sign language is included in the list of official language
    //ToDO Mapitsi - get countries -do a test to validate south africa is in the list
}
