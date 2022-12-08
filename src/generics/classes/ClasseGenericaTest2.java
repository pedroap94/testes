package generics.classes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClasseGenericaTest2 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Gol");
        Carro c2 = new Carro("BMW");

        List<Carro> carros = new ArrayList<>(Arrays.asList(c1, c2));
        Alugavel alugavel = new Alugavel(carros);
        alugavel.getObjetosDisponiveis();

        Alugavel computadoresAlugaveis = new Alugavel(new ArrayList<>(Arrays.asList(new Computador("Celeron"), new Computador("Intel"))));
        computadoresAlugaveis.getObjetosDisponiveis();
    }
}

//Type
//Quando estamos trabalhando com coleções, utilizamos E de element, como aqui não é um elemento de uma coleção, utilizamos o T de type
class Alugavel<T> {
    private List<T> objetosDisponiveis;

    public Alugavel(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T getObjetosDisponiveis() {
        T c = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: " + c);
        System.out.println("Objetos disponíveis: " + objetosDisponiveis);
        return c;
    }

    public void devolverObjetoAlugado(T c) {
        System.out.println("Devolvendo objeto: " + c);
        objetosDisponiveis.add(c);
        System.out.println("Objetos disponíveis: " + objetosDisponiveis);
    }
}