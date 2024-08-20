import java.util.Scanner;

public class CalcMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar as notas
        double nota1, nota2, nota3, nota4;

        // Leitura das notas
        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota:");
        nota4 = scanner.nextDouble();

        // Calculando a média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Exibindo a média no console
        System.out.println("A média das notas é: " + media);

        // Fechando o scanner
        scanner.close();
    }
}
