// Classe principal para criar e usar o objeto Bola
public class Main {
    public static void main(String[] args) {
        // Criando um objeto 'bola' com características específicas
        Bola bola = new Bola("Vermelha", "Couro", 22.0, 0.45);

        // Exibindo as características da bola
        System.out.println("Características da bola:");
        System.out.println("Cor: " + bola.getCor());
        System.out.println("Material: " + bola.getMaterial());
        System.out.println("Diâmetro: " + bola.getDiametro() + " cm");
        System.out.println("Peso: " + bola.getPeso() + " kg");
    }
}
