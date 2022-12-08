package generics.classes;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest {
    public static void main(String[] args) {
        CarroAlugado carroAlugavel = new CarroAlugado();
        Carro carroAlugado = carroAlugavel.getCarroDisponivel();
        System.out.println("Usando o carro por um mês");
        carroAlugavel.devolverCarro(carroAlugado);
    }
}

class CarroAlugado {
    private List<Carro> carrosDisponiveis = new ArrayList<>();

    {
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
    }

    public Carro getCarroDisponivel() {
        Carro c = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro " + c);
        System.out.println("Carros disponíveis " + carrosDisponiveis);
        return c;
    }

    public void devolverCarro(Carro c) {
        System.out.println("Devolvendo carro " + c);
        carrosDisponiveis.add(c);
        System.out.println("Carros disponíveis " + carrosDisponiveis);
    }
}