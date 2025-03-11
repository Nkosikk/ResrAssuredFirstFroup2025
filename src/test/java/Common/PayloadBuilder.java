package Common;

import org.json.simple.JSONObject;

import static Common.TestDataCreation.*;

public class PayloadBuilder {

    public static JSONObject createEmployeeObject(){

        JSONObject empFields = new JSONObject();
        empFields.put("email", emailAddress);
        empFields.put("first_name",first_name);
        empFields.put("last_name", last_name);
        empFields.put("avatar", "https://reqres.in/img/faces/2-image.jpg");

        return empFields;
    }

    public static JSONObject unsuccessfulLogin(){

        JSONObject object = new JSONObject();
        object.put("email", emailAddress);


        return object;
    }
}
