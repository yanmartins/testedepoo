package engtelecom.poo;

import engtelecom.poo.Exercicio01;
import engtelecom.poo.Exercicio02;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Classe para realizar testes de unidade e verificar a corretude das soluções desenvolvidas pelos alunos
 *
 * Alguns exemplos de como usar JUnit podem ser obtidos aqui: https://github.com/junit-team/junit4/wiki/Assertions
 */
public class TesteDeValidacao {

    @Test
    public void exercicio01(){
        Exercicio01 ex = new Exercicio01();
        assertEquals("falha no ex01", "equilátero", ex.tipoTriangulo(3,3,3));
        assertEquals("falha no ex01", "isósceles", ex.tipoTriangulo(3,3,4));
        assertEquals("falha no ex01", "escaleno", ex.tipoTriangulo(3,4,5));
        assertEquals("falha no ex01", "não forma um triângulo", ex.tipoTriangulo(1,10,3));
    }


    @Test
    public void exercicio02() {
        Exercicio02 ex = new Exercicio02();
        assertEquals("falha no ex02",1.5, ex.somaSerieHarmonica(2));
        assertEquals("falha no ex02",2.083333333333333, ex.somaSerieHarmonica(4));
        assertEquals("falha no ex02",2.7178571428571425, ex.somaSerieHarmonica(8));
        assertEquals("falha no ex02",3.3807289932289937, ex.somaSerieHarmonica(16));
        assertEquals("falha no ex02",4.05849519543652, ex.somaSerieHarmonica(32));
        assertEquals("falha no ex02",4.7438909037057675, ex.somaSerieHarmonica(64));
    }

    @Test
    public void exercicio03(){
        Exercicio03 ex = new Exercicio03();
        assertEquals("falha no ex03", "2, 3, 5, 7", ex.encontraNumerosPrimos(1,10));
        assertEquals("falha no ex03", "ERRO: o primeiro número é maior que o segundo", ex.encontraNumerosPrimos(10, 1));
        assertEquals("falha no ex03", "ERRO: os dois números são iguais, não existe um intervalo", ex.encontraNumerosPrimos(2, 2));
        assertEquals("falha no ex03","2, 3, 5, 7, 11, 13, 17, 19, 23", ex.encontraNumerosPrimos(0,25));
    }

    @Test
    public void exercicio04(){
        Exercicio04 ex = new Exercicio04();
        assertEquals("falha no ex04", "É um número perfeito", ex.numeroPerfeito(6));
        assertEquals("falha no ex04", "É um número perfeito", ex.numeroPerfeito(28));
        assertEquals("falha no ex04", "Não é perfeito", ex.numeroPerfeito(29));
        assertEquals("falha no ex04", "Não é perfeito", ex.numeroPerfeito(40));
    }

    @Test
    public void exercicio05(){
        Exercicio05 ex = new Exercicio05();
        assertEquals("falha no ex05", "5 x 5", ex.decomposicao(25));
        assertEquals("falha no ex05", "2 x 3 x 3 x 5 x 7", ex.decomposicao(630));
        assertEquals("falha no ex05", "ERRO: é necessário um número maior que 1", ex.decomposicao(1));
        assertEquals("flaha no ex05", "2", ex.decomposicao(2));
    }

    @Test
    public void exercicio06(){
        Exercicio06 ex = new Exercicio06();
        assertEquals("falha no ex06", "Nº máximo de faltas permitidas: 9, percentual de faltas: 5%, o aluno ainda pode faltar: 7 dias.", ex.faltasDeAlunos(72,2,2));
        assertEquals("falha no ex06", "Nº máximo de faltas permitidas: 9, percentual de faltas: 25%, o aluno não pode faltar, atingiu o limite", ex.faltasDeAlunos(72,2,9));
        assertEquals("falha no ex06", "Nº máximo de faltas permitidas: 9, percentual de faltas: 27%, o aluno reprovou por faltas", ex.faltasDeAlunos(72,2,10));
        assertEquals("falha no ex06", "ERRO: número de faltas é maior que o número de aulas", ex.faltasDeAlunos(72,10,10));
        assertEquals("falha no ex06", "ERRO: horas de aula por dia é maior que o total de horas da disciplina", ex.faltasDeAlunos(72,80,2));
    }
}
