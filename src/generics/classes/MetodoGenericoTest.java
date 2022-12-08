package generics.classes;

import generics.Animal;
import generics.Gato;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest {
    public static void main(String[] args) {
        criarArray(new Gato());
    }

    //Quando estamos criando métodos genéricos, temos que definir o tipo antes do retorno
    public static <T extends Animal> void criarArray(T t) {
        List<T> lista = new ArrayList<>();
        lista.add(t);
    }
}
