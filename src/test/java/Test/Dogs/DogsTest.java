package Test.Dogs;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static Common.CommonTestData.Success_Status_Code;
import static Common.RequestBuilder.GetListOfAllBreeds;

@Test
@Feature("Dogs API")
@Story("List of dogs")
public class DogsTest {

    public void GetListOfAllBreedsTest(){
        GetListOfAllBreeds().
                then().
                assertThat().
                statusCode(Success_Status_Code);
    }
}
