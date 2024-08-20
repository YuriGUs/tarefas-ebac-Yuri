import java.util.Scanner;

public class ConverterPrimitivoWrapper {
    public static void main(String[] args) {
        // Criação de um Scanner para leitura do valor numérico
        Scanner scanner = new Scanner(System.in);

        // Leitura do valor numérico (tipo primitivo int)
        System.out.print("Digite um número inteiro: ");
        int valorPrimitivo = scanner.nextInt();

        // Conversão do tipo primitivo para o tipo wrapper (Integer)
        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        // Impressão do valor primitivo e do valor wrapper
        System.out.println("Valor primitivo: " + valorPrimitivo);
        System.out.println("Valor wrapper: " + valorWrapper);
    }
}
