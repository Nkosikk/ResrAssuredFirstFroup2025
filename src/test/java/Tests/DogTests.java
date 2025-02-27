package Tests;

import org.testng.annotations.Test;

import static Common.CommonTestData.Success_Status_Code;
import static Common.RequestBuilder.getBreedImagesResponse;
import static Common.RequestBuilder.getListOfAllBreedsResponse;

@Test
public class DogTests {
    public void getListOfAllBreedsTests(){
        getListOfAllBreedsResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code);
    }

    public void getBreedImageTests(){
        getBreedImagesResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code);
    }
}
