package Tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static Common.CommonTestData.Success_Status_Code;
import static Common.RequestBuilder.getListOfUsersResponse;
import static Common.RequestBuilder.getSingleResourceResponse;

@Test
public class ReqresTests{
@Description("Tests for Reqres API")
@Severity(SeverityLevel.MINOR)

    public void getListOfUsersTests(){
        getListOfUsersResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code);
    }

    public void getSingleUserTests(){
     getSingleResourceResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code);
    }




}
