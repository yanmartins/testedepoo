package engtelecom.poo;

public class Exercicio04 {

    /**
     * Verifica se o número informado é um número perfeito
     * @param num número a ser analisado
     * @return retorna as seguintes Strings: 'É um número perfeito' ou 'Não é perfeito'
     */

    public String numeroPerfeito(int num){
        int memoria = 0; // Guarda o resultado anterior da soma de verificação de número perfeito
        String tipo = "";

        for(int i = 1; i < num; i++){
            if(num%i == 0){
                memoria = (i+memoria); // Soma de verificação de número perfeito
            }
        }
        if(num == memoria)
        {
            tipo = "É um número perfeito";
        }
        else tipo = "Não é perfeito";

        return tipo;
    }
}
