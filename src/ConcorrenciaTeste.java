import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcorrenciaTeste {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = Arrays.asList(1);
        List<Integer> retorno = Arrays.asList(1, 1, 1, 1, 1, 1, 1);

            modificarNumero(retorno);

        System.out.println("Tamanho entrada" + list.size());
        System.out.println("Tamanho retorno" + retorno.size());

    }

    private static void modificarNumero(List<Integer> listaDeRetorno) {

        for (Integer valor : listaDeRetorno) {
            Integer inteiro = 0;
            while (inteiro < 1000000000) {
                inteiro++;
            }
        }
    }
}
