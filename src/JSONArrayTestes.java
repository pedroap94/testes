import org.json.JSONArray;
import org.json.JSONObject;

import java.util.stream.Collectors;

public class JSONArrayTestes {
    public static void main(String[] args) {
        JSONArray jsonArray = new JSONArray();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("nome", "bird");
        jsonObject.put("estados", "estado1");

        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("nome", "outro");
        jsonObject2.put("estados", "estado2");

        jsonArray.put(jsonObject);
        jsonArray.put(jsonObject2);

        JSONObject finalizando = new JSONObject();
        finalizando.put("produtos", jsonArray);

        String produto = finalizando.getJSONArray("produtos").toList().stream()
                .filter(n -> n.toString().toUpperCase().contains("BIRD"))
                .collect(Collectors.toList()).toString();

        System.out.println(produto);

        System.out.println(String.format("\u274C"));
    }
}
