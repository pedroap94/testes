import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestandoSenhaValida {
    private static final String REGEX_VALIDA_SENHA = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&#])[A-Za-z\\d@$!%*?&#]{8,20}$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com senha");
        teste(sc.next());
        System.out.println("Senha válida");
    }

    public static void teste(String senha){
        Pattern pattern = Pattern.compile(REGEX_VALIDA_SENHA);
        Matcher matcher = pattern.matcher(senha);
        if (!matcher.matches()){
            throw new IllegalArgumentException("Senha inválida");
        }
    }
}
