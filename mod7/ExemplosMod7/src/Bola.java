public class Bola {
    // Características (campos) da bola
    private String cor;
    private String material;
    private double diametro;
    private double peso;

    // Construtor para inicializar as características da bola
    public Bola(String cor, String material, double diametro, double peso) {
        this.cor = cor;
        this.material = material;
        this.diametro = diametro;
        this.peso = peso;
    }

    // Métodos para acessar e modificar as características da bola

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

