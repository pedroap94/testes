import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class testStreamJoining {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Joaozinho", new Login("41", "joaozinho@admin"), new Date(), false);
        Cliente cliente2 = new Cliente(null, new Login("41", "joaozinho@admin"), new Date(), true);
        List<Cliente> clientes = Arrays.asList(cliente1, cliente2);

        String collect = clientes.stream()
                .filter(Cliente::getAptidao)
                .map(Cliente::getCliente)
                .collect(Collectors.joining());

        System.out.println("Collect nula: " + collect == null ? "Verdade" : "Falso");
        if(collect.equals("null") && collect.isEmpty()) {
            System.out.println("Collect nula em string: Verdade");
        } else if (collect.isEmpty()) {
            System.out.println("Variável vazia");
        }

        System.out.println("saída: " + collect);
    }


}
