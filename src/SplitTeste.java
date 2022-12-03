import java.util.ArrayList;
import java.util.List;

public class SplitTeste {
    public static void main(String[] args) {
        List<Cliente> list = new ArrayList<>();

        String saida = "";
        for (Cliente s : list) {
           saida = s.getCliente().split("\\.")[0];
        }

        System.out.println(saida);
    }
}
