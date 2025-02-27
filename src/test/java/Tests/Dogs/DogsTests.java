package Tests.Dogs;


import io.qameta.allure.*;
import org.testng.annotations.Test;

import static Common.CommonTestData.Success_Status_Code;
import static Common.RequestBuilder.getListOfAllBreedsResponse;

@Test
@Feature("Dogs API")
@Story("List of dogs")
public class DogsTests {

    @Description("As an api user i want to see all the dogs list")
    @Severity(SeverityLevel.BLOCKER)
    public void getListOfAllBreedsTests(){
        getListOfAllBreedsResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code);
    }






}
