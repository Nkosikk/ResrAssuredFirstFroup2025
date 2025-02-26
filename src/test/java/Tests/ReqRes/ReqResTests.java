package Tests.ReqRes;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static Common.CommonTestData.Success_Status_Code;
import static Common.RequestBuilder.*;
import static org.hamcrest.Matchers.notNullValue;

@Test
@Feature("ReqRes API")
@Story("List of users")
public class ReqResTests {
    @Description("As an api user i want to see all registered users")
    @Severity(SeverityLevel.BLOCKER)
    public void getListOfSuccessfulRegistrationsTest() {
        getListOfSuccessfulRegistrationsResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code).
                body("id", notNullValue()).
                body("token", notNullValue());
    }

    public void getDelayedResponseTest() {
        getDelayedResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code);
    }


}
