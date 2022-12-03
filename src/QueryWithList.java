import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QueryWithList {
    public static void main(String[] args) {
        List<Integer> idades = new ArrayList<>();
        idades.add(1);
        idades.add(2);
        idades.add(3);
        idades.add(4);

        String collect = idades.stream().map(String::valueOf).collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
