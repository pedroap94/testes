public class AssertTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(null);

        String teste = null;
        assert cliente.getCliente() == null : false;
        cliente.setCliente("Teste");
        System.out.println(cliente);
    }

    private String setStatus(String valor){
        return valor;
    }
}
