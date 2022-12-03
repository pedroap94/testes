import org.json.JSONArray;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DateFormatSpecific {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd@HH:mm:ss.SSSZ");

        JSONObject json = new JSONObject();
        List<String> teste = Arrays.asList("12345678");

        JSONArray jsonArray = new JSONArray(teste);
        json.put("cpfs", jsonArray);
        json.put("data", sdf.format(new Date()));

        System.out.println(json);
    }
}
