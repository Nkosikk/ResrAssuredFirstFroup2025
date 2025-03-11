package Common;

import org.json.simple.JSONObject;

import java.awt.*;

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



    public static JSONObject weatherStationStationObject(String external_id, String name,double latitude,double longitude,int altitude ){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id",external_id);
        jsonObject.put("name",name);
        jsonObject.put("latitude",latitude);
        jsonObject.put("longitude",longitude);
        jsonObject.put("altitude",altitude);
        return jsonObject;
    }
}

