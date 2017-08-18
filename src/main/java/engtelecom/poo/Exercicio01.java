package engtelecom.poo;

public class Exercicio01 {

    /**
     * Verifica se os valores passados como parâmetro formam ou não um triângulo, indicando ainda qual o tipo do triângulo.
     * @param a lado a
     * @param b lado b
     * @param c lado c
     * @return retorna as seguintes Strings: 'equilátero', 'isósceles', 'escaleno' ou 'não forma um triângulo'
     */
    public String tipoTriangulo(int a, int b, int c){
        String tipo = null;

        if(a+b > c && b+c > a && c+a > b) {
            if (a == b && b == c && c == a) {
                tipo = "equilátero";
            } else if (a == b || b == c || c == a) {
                tipo = "isósceles";
            }
            else tipo = "escaleno";
        }
        else tipo = "não forma um triângulo";
        return tipo;
    }

}
