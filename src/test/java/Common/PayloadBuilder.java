package Common;

import org.json.simple.JSONObject;

public class PayloadBuilder {

    public static JSONObject createEmployeeObject(){

        JSONObject empFields = new JSONObject();
        empFields.put("email", "veronicammabatho@yahoo.com");
        empFields.put("first_name", "Veronica");
        empFields.put("last_name", "Mphahlele");
        empFields.put("avatar", "https://reqres.in/img/faces/2-image.jpg");

        return empFields;
    }
}
