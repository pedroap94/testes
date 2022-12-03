import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MapStreamTestes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal max = null;

        Map<String, Orcamento> orcamentosMap = new HashMap<>();
        orcamentosMap.put("primeiro", new Orcamento("operadora1", new BigDecimal(100), "nada"));
        orcamentosMap.put("segundo", new Orcamento("operadora2", new BigDecimal(200), "nada"));
        orcamentosMap.put("teceiro", new Orcamento("operadora3", new BigDecimal(300), "nada"));

        BigDecimal min = new BigDecimal(200);

        Orcamento teste = orcamentosMap.get("quarto");


        orcamentosMap = orcamentosMap.entrySet().stream().filter(orcamento -> orcamento.getValue().getValorTotal().compareTo(min) >= 0
                && (max == null || orcamento.getValue().getValorTotal().compareTo(max) <= 0)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        orcamentosMap.forEach((chave, valor) -> System.out.println(chave));
    }
}
