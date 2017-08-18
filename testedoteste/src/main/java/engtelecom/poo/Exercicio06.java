package engtelecom.poo;

public class Exercicio06 {

    /**
     * Informa o número máximo de faltas que um aluno poderia ter (em dias); o percentual de faltas que o aluno já possui
     * e a quantidade de dias que o aluno ainda poderia faltar sem ser reprovado
     * @param totalDeHoras total de horas da disciplina
     * @param horasPorDia quantidade de horas por dia de aula
     * @param diasFaltados dias que o aluno faltou
     * @return retorna uma única String que informa o número máximo de faltas da disciplina, o percentual de faltas do aluno e a quantidade de dias que o aluno ainda pode faltar.
     */

    public String faltasDeAlunos(int totalDeHoras, int horasPorDia, int diasFaltados){

        int numeroDeAulas, porcentagemDeFaltas, porcentagemDePresenca;
        int diasQuePodemFaltar, diasQueRestam;
        String resultado = "";

        numeroDeAulas = totalDeHoras/horasPorDia; // Calcula a quantidade de aulas da disciplina

        if(totalDeHoras < horasPorDia){
            return resultado = "ERRO: horas de aula por dia é maior que o total de horas da disciplina";
        }

        porcentagemDeFaltas = ((100*diasFaltados)/numeroDeAulas); // Calcula o percentual de faltas do aluno
        porcentagemDePresenca = (100 - porcentagemDeFaltas); // Calcula o percentual de presenças do aluno
        diasQuePodemFaltar = ((numeroDeAulas*25)/100); // Calcula a quantidade de dias que o aluno ainda pode faltar

        if(diasFaltados > numeroDeAulas){
            return resultado = "ERRO: número de faltas é maior que o número de aulas";
        }

        else {
            if (porcentagemDePresenca < 75) {
                resultado = "Nº máximo de faltas permitidas: " + diasQuePodemFaltar + ", percentual de faltas: " + porcentagemDeFaltas + "%, o aluno reprovou por faltas";
            }
            else if (porcentagemDePresenca == 75) {
                resultado = "Nº máximo de faltas permitidas: " + diasQuePodemFaltar + ", percentual de faltas: " + porcentagemDeFaltas + "%, o aluno não pode faltar, atingiu o limite";
            }
            else {
                diasQueRestam = (diasQuePodemFaltar - diasFaltados);
                resultado = "Nº máximo de faltas permitidas: " + diasQuePodemFaltar + ", percentual de faltas: " + porcentagemDeFaltas + "%, o aluno ainda pode faltar: " + diasQueRestam + " dias.";
            }
        }
        return resultado;
    }
}