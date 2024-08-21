import java.util.*;

public class TarefaColecoesGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos nomes com os gêneros
        System.out.println("Digite os nomes com gênero (Exemplo: Rodrigo - M, Luana - F):");
        String input = scanner.nextLine();

        // Separar os pares de nome e gênero
        String[] pares = input.split(",");

        // Criar mapas para armazenar os grupos por gênero
        Map<String, List<String>> grupos = new HashMap<>();
        grupos.put("M", new ArrayList<>());
        grupos.put("F", new ArrayList<>());

        // Separar os nomes por gênero
        for (String par : pares) {
            String[] detalhes = par.trim().split(" - ");
            String nome = detalhes[0].trim();
            String genero = detalhes[1].trim();

            // Adicionar o nome ao grupo correspondente
            if (grupos.containsKey(genero)) {
                grupos.get(genero).add(nome);
            }
        }

        // Ordenar os nomes em cada grupo
        for (Map.Entry<String, List<String>> entry : grupos.entrySet()) {
            Collections.sort(entry.getValue());
        }

        // Imprimir os grupos separados
        System.out.println("Grupo Masculino (M): " + grupos.get("M"));
        System.out.println("Grupo Feminino (F): " + grupos.get("F"));

        scanner.close();
    }
}
