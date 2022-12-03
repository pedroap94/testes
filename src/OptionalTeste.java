import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;

public class OptionalTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String auxiliar = scanner.next();
        String palavra = null;
        if(auxiliar.equals("a")){
            palavra = "";
        }


        try {
            Optional<String> optional = Optional.ofNullable(palavra);
            if (optional.isPresent()) {
                String retorno = optional.get();
                if (!retorno.isEmpty()) {
                    System.out.println(retorno);
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                throw new NoSuchElementException();
            }
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("nulo ou vazio");
        }
    }
}
