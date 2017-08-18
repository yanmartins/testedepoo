package engtelecom.poo;

import java.util.Scanner;

/**
 * Instituto Federal de Santa Catarina - IFSC
 * Engenharia de Telecomunicações
 * POO29004 - Programação Orientada a Objetos
 *
 * Lista de exercício 01
 */
public class Lista01 {

    /**
     * Método que é chamado pelo sistema operacional
     *
     * @param args argumentos de linha de comando
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao = 0;

        while(opcao != 7) {

            System.out.println("Digite o número do respectivo exercício que você deseja executar ou 7 para sair");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    Exercicio01 ex01 = new Exercicio01();
                    System.out.println("Digite o primeiro lado do seu triângulo");
                    int lado1 = leia.nextInt();
                    System.out.println("Digite o segundo lado do seu triângulo");
                    int lado2 = leia.nextInt();
                    System.out.println("Digite o terceiro lado do seu triângulo");
                    int lado3 = leia.nextInt();
                    System.out.println("Ex01: " + ex01.tipoTriangulo(lado1, lado2, lado3));
                    break;

                case 2:
                    Exercicio02 ex02 = new Exercicio02();
                    System.out.println("Digite um número para o cálculo da série harmônica");
                    int num = leia.nextInt();
                    System.out.println("Ex02: " + ex02.somaSerieHarmonica(num));
                    break;

                case 3:
                    Exercicio03 ex03 = new Exercicio03();
                    System.out.println("Digite o primeiro número de um intervalo para exibição dos números primos");
                    int num1 = leia.nextInt();
                    System.out.println("Digite o segundo número de um intervalo para exibição dos números primos");
                    int num2 = leia.nextInt();
                    System.out.println("Ex03: " + ex03.encontraNumerosPrimos(num1, num2));
                    break;

                case 4:
                    Exercicio04 ex04 = new Exercicio04();
                    System.out.println("Digite um número para verificar se ele é perfeito");
                    int numPerfeito = leia.nextInt();
                    System.out.println("Ex04: " + ex04.numeroPerfeito(numPerfeito));
                    break;

                case 5:
                    Exercicio05 ex05 = new Exercicio05();
                    System.out.println("Digite um número para obter sua decomposição");
                    int numParaDecompor = leia.nextInt();
                    System.out.println("Ex05: " + ex05.decomposicao(numParaDecompor));
                    break;

                case 6:
                    Exercicio06 ex06 = new Exercicio06();
                    System.out.print("Digite o total de horas da disciplina: ");
                    int totalDeHoras = leia.nextInt();
                    System.out.print("Digite o total de horas por dia da disciplina: ");
                    int horasPorDia = leia.nextInt();
                    System.out.print("Digite o total de dias que o aluno faltou: ");
                    int diasFaltados = leia.nextInt();
                    System.out.println("Ex06: " + ex06.faltasDeAlunos(totalDeHoras, horasPorDia, diasFaltados));
                    break;
            }
        }
    }
}
