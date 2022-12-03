public class Main {
    public static void main(String[] args) {
        String string = "Anexo, V, IV";
        String[] saida = string.replaceAll("V", "teste")
                        .replaceAll("IV", "oi")
                        .split(" ");

        for (String c: saida) {
            System.out.println(c);
        }
    }

}
