package tarefa;

@Tabela("carros")
public class Carr {
    private String marca;
    private String modelo;

    public Carr(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
}
