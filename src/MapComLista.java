import java.util.*;

public class MapComLista {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5);

        Map<String, List<Integer>> map = new HashMap<>();

        lista.forEach(
                item -> {
                    if (map.containsKey("teste")){
                        map.get("teste").add(item);
                    }
                    else {
                        List<Integer> lista2 = new ArrayList<>();
                        lista2.add(item);
                        map.put("teste", lista2);
                    }
                }
        );
        System.out.println(map);
    }
}
