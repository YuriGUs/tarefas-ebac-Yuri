import java.util.*;

public class TarefaColecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos nomes separados por vírgula
        System.out.println("Digite os nomes separados por vírgula:");
        String input = scanner.nextLine();

        // Separar os nomes usando split
        String[] nomes = input.split(",");

        // Remover espaços em branco adicionais e adicionar à lista
        List<String> listaNomes = new ArrayList<>();
        for (String nome : nomes) {
            listaNomes.add(nome.trim());
        }

        // Ordenar os nomes em ordem alfabética
        Collections.sort(listaNomes);

        // Imprimir os nomes ordenados
        System.out.println("Nomes ordenados:");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
