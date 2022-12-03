import org.json.JSONObject;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MapToJson {
    public static void main(String[] args) {
        Map<String, BigDecimal> valorMinMax = new HashMap<>();
        valorMinMax.put("min", new BigDecimal(0));
        valorMinMax.put("max", new BigDecimal(0));

        Orcamento orcamento = new Orcamento("teste", new BigDecimal(0), "", valorMinMax);

        JSONObject jsonObject = new JSONObject(orcamento);
        System.out.println(jsonObject);
    }
}
