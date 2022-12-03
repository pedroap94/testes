import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        Socio socio1 = new Socio("123", false, "João");
        Socio socio2 = new Socio("456", false, "Pedro");
        Socio socio3 = new Socio("789", true, "Paulo");

        List<Socio> socios = Arrays.asList(socio1, socio2, socio3);

        String cpf = socios.stream().filter(Socio::isResponsavelReceita).map(Socio::getCpf).collect(Collectors.joining());
        System.out.println(cpf);


    }
}
