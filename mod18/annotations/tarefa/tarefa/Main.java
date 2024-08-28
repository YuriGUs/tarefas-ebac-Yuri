package tarefa;

public class Main {
    public static void main(String[] args) {
        Class<Carr> carroClass = Carr.class;

        // Verifica se a classe Carro tem a anotação @Tabela
        if (carroClass.isAnnotationPresent(Tabela.class)) {
            // Obtém a anotação
            Tabela tabela = carroClass.getAnnotation(Tabela.class);
            // Exibe o nome da tabela
            System.out.println("Nome da Tabela: " + tabela.value());
        }
    }
}
