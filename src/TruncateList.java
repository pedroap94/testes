import java.util.Arrays;
import java.util.List;

public class TruncateList {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9);
        lista.subList(0,2);
    }
}
