import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSONObjectTests {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        List<Cliente> list = Arrays.asList(new Cliente("cliente1", null, null, null), new Cliente("cliente2", null, null, null));

        jsonObject.put("teste", list);

        String teste = jsonObject.toString();

        JSONObject object = new JSONObject(teste);
        System.out.println(object.getJSONArray("teste"));



    }
}
