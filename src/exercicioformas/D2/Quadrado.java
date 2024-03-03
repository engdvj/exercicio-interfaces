package exercicioformas.D2;

public class Quadrado implements Forma2D{
    protected double lado;
    @Override
    public String getNome() {
        return "Quadrado";
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return this.lado *2;
    }
}
