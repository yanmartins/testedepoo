package engtelecom.poo;
import java.util.Scanner;

public class Exercicio02 {

    /**
     * Faz a soma de uma série harmônica: 1 + 1/2 + 1/3 + 1/4 + 1/5 + ...
     *
     * @param n número de elementos da série
     * @return a soma de uma série harmônica
     */

    public double somaSerieHarmonica(int n) {
        double resultado = 0; // Armazena o resultado final da série harmônica
        double memoria = 0; // Utilizado para guardar o resultado anterior

        for(int i = 1; i <= n; i++) {
            resultado = (1./i +memoria);
            memoria = resultado;
        }
        return resultado;
    }
}