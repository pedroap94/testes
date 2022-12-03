import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class MapTests {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("um", "atual");
        map.put("dois", "testando");

        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }


    }
}
