package exercicioformas.D2;

public class Retangulo implements Forma2D{
    private double lado1;
    private double lado2;

    @Override
    public String getNome() {
        return "Retângulo";
    }

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double area() {
        return lado1*lado2;
    }
}
