package Test.Dogs;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static Common.CommonTestData.Success_Status_Code;
import static Common.RequestBuilder.DisplaySingleRandomImage;
import static Common.RequestBuilder.GetListOfAllBreeds;

@Test
@Feature("Dogs API")
@Story("List of dogs")
public class DogsTest {

    @Description("Testing this code")
    @Severity(SeverityLevel.NORMAL)
    public void GetListOfAllBreedsTest(){
        GetListOfAllBreeds().
                then().
                assertThat().
                statusCode(Success_Status_Code);
    }

    public void DisplaySingleRandomImageTest(){
        DisplaySingleRandomImage().
                then().
                assertThat().
                statusCode(Success_Status_Code);

    }
}
