package engtelecom.poo;
import java.util.Scanner;

public class Exercicio03 {
    /**
     * Informa todos os números primos dentro de um intervalo definido pelo usuário.
     * @param num1 primeiro número do intervalo
     * @param num2 último número do intervalo
     * @return retorna os números primos e duas mensagens de erro
     */

    public String encontraNumerosPrimos(int num1, int num2){

        String primos = "";

        if(num1 > num2){
            return primos = "ERRO: o primeiro número é maior que o segundo";
        }
        else if(num1 == num2){
            return primos = "ERRO: os dois números são iguais, não existe um intervalo";
        }
        else {
            for(int i = num1; i <= num2; i++){

                //O 1 e o 0 não são primos
                if (i == 1 || i == 0){
                }

                //O dois é o único par que é primo
                else if(i == 2){
                    primos = primos + i;
                }

                //Verificando se o ímpar é primo
                else{
                    int contador = 0;
                    for(int j = 2; j <= i; j++){
                        if(i % j == 0){
                            contador++;
                        }
                    }
                    if (contador > 1){
                    } else{
                        primos = primos + ", " + i;
                    }
                }
            }
        }
        return primos;
    }
}
