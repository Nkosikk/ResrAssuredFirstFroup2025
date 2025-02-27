package Tests.ReqRes;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static Common.CommonTestData.Success_Status_Code;
import static Common.RequestBuilder.getSingleResourceResponse;

@Test
@Feature("ReqRes API")
@Story("Single Resource")
public class ReqResTests {
    public void getSingleResourceTests() {
        getSingleResourceResponse().then().assertThat().statusCode(Success_Status_Code);

    }


}

