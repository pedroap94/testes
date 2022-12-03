import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MapJsonTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Key", "Value");

        JSONObject jsonObject = new JSONObject(map);
        System.out.println(jsonObject);
    }
}
