package main.java.mod20.tarefas_streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // lendo entradas do console
        System.out.println("Digite os nomes com o gênero separado por vírgula (Ex: Maria,Feminino; Joao,Masculino):");
        String input = scanner.nextLine();

        List<String> pessoas = Arrays.asList(input.split(";"));

        // Criar uma lista de pessoas filtrando apenas as mulheres
        List<String> mulheres = pessoas.stream()
                .filter(pessoa -> {
                    String[] detalhes = pessoa.split(",");
                    String nome = detalhes[0].trim();
                    String genero = detalhes[1].trim();

                    // verificando o gênero
                    if (genero.equalsIgnoreCase("Feminino")) {
                        return true;
                    } else {
                        return false;
                    }
                })
                .collect(Collectors.toList());

        // imprimindo lista de mulheres no console
        System.out.println("Lista de mulheres:");
        mulheres.forEach(System.out::println);

        System.out.println("lista completa: " + pessoas);

        scanner.close();
    }
}