// Exercicio - PARTE 2
// Solução de exercícios da seção 5
package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Exercício 01
        /*
        System.out.println("ENTRADA: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double notaFinal = nota1 + nota2;

        System.out.println("SAIDA:");
        if (notaFinal < 60.0){
            System.out.printf("NOTA FINAL: %.1f%n", notaFinal);
            System.out.println("REPROVADO");
        } else {
            System.out.printf("NOTA FINAL: %.1f%n", notaFinal);
            System.out.println("APROVADO");
        }
        */
        // Exercício 02
        /*
        System.out.println("ENTRADA: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double delta = ((b * b) - (4.0 * a * c));

        System.out.println("SAIDA:");
        if (a == 0 || delta < 0.0){
            System.out.println("Impossivel calcular!");
        } else {
            double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);

            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);

        }
        */

        // Exercício 03
        /*
        System.out.println("ENTRADA: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if (a < b && a < c) {
            System.out.println("MENOR = " + a);
        } else if (b < c) {
            System.out.println("MENOR = " + b);
        } else {
            System.out.println("MENOR = " + c);
        }
        */
        // Exercício 04
        /*
        System.out.println("ENTRADA: ");
        int number = sc.nextInt();


        if (number < 0 ) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }
        */
        // Exercício 05
        /*
        System.out.println("ENTRADA: ");
        int number = sc.nextInt();

        if (number%2 == 0 ) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        */
        // Exercício 06
        /*
        System.out.println("ENTRADA: ");
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A%B == 0 || B%A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Não sao Multiplos");
        }
        */
        // Exercício 07
        /*
        System.out.println("ENTRADA: ");
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracao;

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        */
        // Exercício 08
        /* CODIGO   |    ESPECIFICAÇÃO     |  PREÇO
        * ---------------------------------------------
        *   1       |    Cachorro Quente   |  R$ 4.00
        *   2       |    X-Salada          |  R$ 4.50
        *   3       |    X-Bacon           |  R$ 5.00
        *   4       |    Torrada Simples   |  R$ 1.00
        *   5       |    Refrigerante      |  R$ 1.50
        */
        /*
        System.out.println("ENTRADA: ");
        int codigo = sc.nextInt();
        int qtdItem = sc.nextInt();

        double total;
        if (codigo == 1) {
            total = qtdItem * 4.00;
        } else if (codigo == 2) {
            total = qtdItem * 4.50;
        } else if (codigo == 3) {
            total = qtdItem * 5.00;
        } else if (codigo == 4) {
            total = qtdItem * 1.00;
        } else {
            total = qtdItem * 1.50;
        }

        System.out.printf("TOTAL: R$ %.2f%n", total);
        */
        // Exercício 09
        /*
        System.out.println("ENTRADA:");
        double anyValue = sc.nextDouble();

        System.out.println("SAIDA:");
        if (anyValue < 0.0 || anyValue > 100.0) {
            System.out.println("Fora de intervalo");
        } else if (anyValue <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else if (anyValue <= 50.0){
            System.out.println("Intervalo [25,50]");
        } else if (anyValue <= 75.0){
            System.out.println("Intervalo [50,75]");
        } else {
            System.out.println("Intervalo [75,100]");
        }
        */
        // Exercício 10
        /*
        System.out.println("ENTRADA:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println("SAIDA:");
        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }
        */
        // Exercício 11
        /* Renda                            |   Imposto de Renda
        * -------------------------------------------------------
        *  de 0.00  a R$ 2000.00            |   Isento
        *  de R$ 2000.01 até R$ 3000.00     |   8 %
        *  de R$ 3000.01 até R$ 4500.00     |   18 %
        *  acima de R$ 4500.00              |   28 %                */
        System.out.println("ENTRADA:");
        double salario = sc.nextDouble();

        double imposto;
        System.out.println("SAIDA:");
        if (salario <= 2000.0) {
            imposto = 0.0;

        } else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;

        } else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;

        } else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }
}
