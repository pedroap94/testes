public class Aspas {
    public static void main(String[] args) {
        String teste = "Testando se - -- --- espaços e .... são diferentes de acordo com as aspa.s";
        String simples = teste.replace('.', ' ')
                .replace('-', ' ');
        String duplas = teste.replace(".", " ")
                .replace("-", " ");

        System.out.println(simples + "\n" + duplas);
    }
}
