package tarefa;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        try {
            // Obtém a classe Carr via reflection
            Class<?> carroClass = Class.forName("tarefa.Carr");

            // Verifica se a classe Carr possui a anotação @Tabela
            Annotation[] annotations = carroClass.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof Tabela) {
                    Tabela tabela = (Tabela) annotation;
                    // Exibe o nome da tabela
                    System.out.println("Nome da Tabela: " + tabela.value());
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
