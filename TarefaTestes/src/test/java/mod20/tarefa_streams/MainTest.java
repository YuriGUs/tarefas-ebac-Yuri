package test.java.mod20.tarefa_streams;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest {

    @Test
    public void testeFiltrarMulheres() {
        // Dados de entrada
        String input = "Maria,Feminino;Joao,Masculino;Ana,Feminino";
        // Separando por ; e criando a lista
        List<String> pessoas = Arrays.asList(input.split(";"));

        // Filtrando mulheres
        List<String> mulheres = pessoas.stream()
                .filter(pessoa -> {
                    String[] detalhes = pessoa.split(",");
                    String nome = detalhes[0].trim();
                    String genero = detalhes[1].trim();
                    return genero.equalsIgnoreCase("Feminino");
                })
                .collect(Collectors.toList());

        // Verificações
        assertFalse(mulheres.isEmpty(), "A lista de mulheres não deveria estar vazia.");
        assertEquals(2, mulheres.size(), "A lista deveria conter 2 mulheres.");
        assertTrue(mulheres.contains("Maria,Feminino"), "A lista não contém 'Maria,Feminino'.");
        assertTrue(mulheres.contains("Ana,Feminino"), "A lista não contém 'Ana,Feminino'.");
    }
}