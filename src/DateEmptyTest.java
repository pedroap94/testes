import java.util.Date;

public class DateEmptyTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pedro", null, null, true);

        if (cliente.getAptidao()){
            System.out.println("vazio é true");
        }
    }
}
