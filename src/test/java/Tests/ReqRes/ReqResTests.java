package Tests.ReqRes;

import io.qameta.allure.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static Common.CommonTestData.*;
import static Common.RequestBuilder.*;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

@Test
@Feature("ReqRes API")
@Story("List of ReqRes users")
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

    @Description("As an API user, I want to get User Created when creating an employee")
    @Severity(SeverityLevel.BLOCKER)
    public void postCreateEmployeeSuccessfulTests() {

        postCreateEmployeeSuccessfulResponse().
                then().assertThat().
                assertThat().
                statusCode(Created_Status_Code).
                time(lessThanOrEqualTo(Expected_Response_Time));
    }

}
