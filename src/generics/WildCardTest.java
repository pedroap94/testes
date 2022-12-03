package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WildCardTest {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        consultarAnimais(cachorros);
        consultarAnimais(gatos);

        consultarAnimaisList(Arrays.asList(new Cachorro(), new Gato()));
        consultarAnimaisList(Arrays.asList(new Cachorro(), new Gato()));

        List<Gato> lista = new ArrayList<>();
        lista.add(new Gato());

        consultarSubClasseAnimal(lista);

    }

    public static void consultarAnimais(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    public static void consultarAnimaisList(List<Animal> animalList) {
        for (Animal animal : animalList) {
            animal.consulta();
        }
    }

    public static void consultarSubClasseAnimal(List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    public static void consultaCahorroList(List<? super Cachorro> cachorros){
        Cachorro c1 = new Cachorro();
        Animal c2 = new Cachorro();
        Object c3 = new Object();

    }

    public static void ordenarLista(List<? extends Comparable> lista){
        Collections.sort(lista);
    }
}
