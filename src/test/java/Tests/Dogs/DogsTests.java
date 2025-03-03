package Tests.Dogs;


import io.qameta.allure.*;
import org.testng.annotations.Test;

import static Common.CommonTestData.Success_Status_Code;
import static Common.RequestBuilder.getListOfAllBreedsResponse;
import static Common.RequestBuilder.getSingleRandomImageResponse;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

@Test
@Feature("Dogs API")
@Story("List of dogs")
@Story("Display single random image from all dogs collection")
public class DogsTests {

    @Description("As an api user i want to see all the dogs list")
    @Severity(SeverityLevel.BLOCKER)
    public void getListOfAllBreedsTests(){
        getListOfAllBreedsResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code);
    }

    public void getSingleRandomImageTests(){
        int num = 0;
        getSingleRandomImageResponse(1).
                then().
                assertThat().
                statusCode(Success_Status_Code);
          //      .body("message", notNullValue())
           //     .body("status", equalTo("success"));

    }


    //ToDO Atha - Display single random image from all dogs collection
    //ToDO Bernard - By breed
    //ToDO Boni - List all sub-breedsBoni
    //ToDO Gumi - Breeds list




}
