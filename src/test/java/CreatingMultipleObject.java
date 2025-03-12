import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class CreatingMultipleObject {


    @Test
    public static void test() {
        JSONArray jsonArray = new JSONArray();

        // Loop to add 50 employees
        for (int i = 1; i <= 50; i++) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("external_id", "SF_TEST" + String.format("%03d", i));  // Unique ID for each employee
            jsonObject.put("name", "FirstGroup2025 Test Station " + i);  // Unique name for each employee
            jsonObject.put("latitude", 37.76);
            jsonObject.put("longitude", -122.43);
            jsonObject.put("altitude", 150);

            // Add each employee object to the array
            jsonArray.add(jsonObject);
        }

        // Print the resulting JSON array containing 50 employees
        System.out.println(jsonArray);
    }

}

