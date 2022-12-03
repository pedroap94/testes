import java.util.logging.Logger;

public class TheadLocalTest {
    private static final ThreadLocal<String> t1 = new ThreadLocal<>();


    public static void main(String[] args) {
        System.out.println(t1.get());
        Cliente cliente = new Cliente();

        System.out.println(cliente.getLogin().getCpf());

    }
}
