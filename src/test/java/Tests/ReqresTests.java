package Tests;

import org.testng.annotations.Test;

import static Common.CommonTestData.Success_Status_Code;
import static Common.RequestBuilder.getListOfUsersResponse;
import static Common.RequestBuilder.getSingleResourceResponse;

@Test
public class ReqresTests {
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
