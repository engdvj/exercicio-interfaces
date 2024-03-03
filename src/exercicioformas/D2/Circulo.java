package exercicioformas.D2;

public class Circulo implements Forma2D{

    private double raio;

    @Override
    public String getNome() {
        return "Circulo";
    }

    public Circulo(double raio) {
        this.raio = raio;
    }
    @Override
    public double area() {
        return Math.pow(Math.PI*raio,2);
    }
}
