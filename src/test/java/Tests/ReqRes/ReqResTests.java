package Tests.ReqRes;

import io.qameta.allure.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static Common.CommonTestData.*;
import static Common.RequestBuilder.*;

@Test
@Feature("ReqRes API")
@Story("List of ReqRes users")
public class ReqResTests {

    public void getSingleResourceTests() {
        getSingleResourceResponse().then().assertThat().statusCode(Success_Status_Code);

    }


    @Description("As an API user, I want to get a Not Found response when I try to get a single user that does not exist")
    @Severity(SeverityLevel.NORMAL)
    public void getSingleUserNotFoundTests() {
        getSingleUserNotFoundResponse().
                then().
                assertThat().
                statusCode(Not_Found_Status_Code);
    }

    @Description("As an API user, I want to get a Bad Request error when I try to login with only email")
    @Severity(SeverityLevel.BLOCKER)
    public void postLoginUnsuccessfulTests() {
        JSONObject illegalLogin = new JSONObject();
        illegalLogin.put("email", "chivu@klaven");

        postLoginUnsuccessfulResponse(illegalLogin).
                then().assertThat().
                assertThat().
                statusCode(Bad_Request_Status_Code);
    }

}
