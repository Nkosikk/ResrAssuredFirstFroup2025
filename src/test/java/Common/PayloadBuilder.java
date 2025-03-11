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



    public static JSONObject weatherStationStationObject(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id","SF_TEST001");
        jsonObject.put("name","FirstGroup2025 Test Station");
        jsonObject.put("latitude",37.76);
        jsonObject.put("longitude",-122.43);
        jsonObject.put("altitude",150);
        return jsonObject;
    }
}

//ToDo Do the chaining of requests - ussing the id from one test to another
// ToDo start weather
