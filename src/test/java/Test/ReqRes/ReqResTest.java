package Test.ReqRes;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static Common.CommonTestData.Success_Status_Code;
import static Common.RequestBuilder.GetAllListOfUsers;


@Test
@Feature("Users API")
@Story("List of users")
public class ReqResTest {
    public void GetAllListOfUsersTest(){
        GetAllListOfUsers().
                then().
                assertThat().
                statusCode(Success_Status_Code);
    }
}
