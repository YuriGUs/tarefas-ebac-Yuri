package tarefa;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define a anotação @tarefa.Tabela
@Retention(RetentionPolicy.RUNTIME) // Anotação disponível em tempo de execução
@Target(ElementType.TYPE) // Anotação aplicada a classes
public @interface Tabela {
    String value(); // Mét0do para receber o nome da tabela
}
