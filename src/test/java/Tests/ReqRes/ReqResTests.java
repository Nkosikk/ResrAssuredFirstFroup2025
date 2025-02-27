package Tests.ReqRes;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static Common.CommonTestData.Success_Status_Code;
import static Common.RequestBuilder.getAllResourcesListedResponse;

@Test
@Feature("ReqRes API")
@Story("List of Resources")

public class ReqResTests {

    @Description("As a user i want to see all resources listed")
    @Severity(SeverityLevel.BLOCKER)
    public void getAllResourcesListed(){
        getAllResourcesListedResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code);
    }

    //ToDo Mmatseba - List <resource>





}
