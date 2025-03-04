package Common;

import org.json.simple.JSONObject;

import static Common.TestDataCreation.first_name;

public class PayloadBuilder {

    public static JSONObject createEmployeeObject(){

        JSONObject empFields = new JSONObject();
        empFields.put("email", "veronicammabatho@yahoo.com");
        empFields.put("first_name",first_name);
        empFields.put("last_name", "Mphahlele");
        empFields.put("avatar", "https://reqres.in/img/faces/2-image.jpg");

        return empFields;
    }
}
