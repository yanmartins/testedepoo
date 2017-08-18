package engtelecom.poo;

public class Exercicio05 {

    /**
     * Decompõe um número informado e verifica se pode ser realizada a decomposição
     * @param num número que será decomposto
     * @return retorna o número decomposto ou a mensagem de erro 'ERRO: é necessário um número maior que 1'
     */

    public String decomposicao(int num){
        String menoresDivisores = "";

        int i = 2;
        int q = 0;
        if(num == 0 || num == 1){
            return menoresDivisores = "ERRO: é necessário um número maior que 1";
        }
        else {

            // O primeiro while serve para que não haja um 'x' no começo ou no final da String
            while (q != 1) {
                if (num % i == 0) {
                    menoresDivisores = menoresDivisores + i;
                    num = num / i;
                    q = 1; // Sai do laço assim que encontra o primeiro divisor
                    i = 1;
                }
                i++;
            }

            while (num != 1) {
                if (num % i == 0) {
                    menoresDivisores = menoresDivisores + " x " + i;
                    num = num / i;
                    i = 1;
                }
                i++;
            }
        }
        return menoresDivisores;
    }
}
