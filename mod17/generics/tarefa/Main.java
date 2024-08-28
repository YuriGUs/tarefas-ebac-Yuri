import java.util.ArrayList;
import java.util.List;

// criando a classe carro
class Carro {
    private String marca; // campo de marca

    // constructor para pedir uma marca quando a classe for instanciada
    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    // sobrescrevendo o metodo Tostring para imprimir a marca
    @Override
    public String toString() {
        return "Marca: " + marca;
    }
}
/*
* 3 classes estendendo a classe carro.
* fazendo a utilização do constructor da classe Carro
* (super) passando o nome da marca.
* */
class Toyota extends Carro {
    public Toyota() {
        super("Toyota");
    }
}

class Ford extends Carro {
    public Ford() {
        super("Ford");
    }
}

class Honda extends Carro {
    public Honda() {
        super("Honda");
    }
}

public class Main {
    public static void main(String[] args) {
        // Lista genérica que aceita qualquer tipo de <Carro>
        List<Carro> listaDeCarros = new ArrayList<>();

        // Adicionando diferentes tipos de carros na lista
        listaDeCarros.add(new Toyota());
        listaDeCarros.add(new Ford());
        listaDeCarros.add(new Honda());

        // Exibindo os carros na lista
        for (Carro carro : listaDeCarros) {
            System.out.println(carro);
        }
    }
}
