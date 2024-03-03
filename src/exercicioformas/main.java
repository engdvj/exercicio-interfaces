package exercicioformas;

import exercicioformas.D2.Circulo;
import exercicioformas.D2.Forma2D;
import exercicioformas.D2.Quadrado;
import exercicioformas.D2.Retangulo;

import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Forma2D> listaDeFormas = List.of(new Quadrado(2),new Retangulo(2,3),
                new Circulo(1));

        imprimirInformacoes(listaDeFormas);
    }
    private static void imprimirInformacoes(List<Forma2D> listaDeFormas) {
        double somaArea = 0;
        for (Forma2D forma : listaDeFormas) {
            somaArea += forma.area();
            System.out.printf("Área do %s: %.2f \n", forma.getNome(), forma.area());
        }
        System.out.printf("Área total: %.2f \n\n", somaArea);
    }
}
