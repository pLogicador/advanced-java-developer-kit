// Soluções da seção 4
package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Exercício 00 - Estrutura Sequêncial
        /*
        System.out.println("Entrada:");
        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.println("Saída:");
        System.out.printf("AREA = %.2f%n" , area);
        System.out.printf("PRECO = %.2f%n" , preco);
        */

        // Exercício 01
        /*
        int firstNumber, secondNumber, sum;

        System.out.println("Entrada:");
        firstNumber = sc.nextInt();
        secondNumber = sc.nextInt();
        sum = firstNumber + secondNumber;

        System.out.println("Saída:");
        System.out.println("Soma = " + sum);

        */
        // Exercício 02
        /*
        double pi, r, A;
        pi = Math.PI;

        System.out.println("Entrada:");
        r = sc.nextDouble();

        A = pi * (Math.pow(r, 2));

        System.out.println("Saída:");
        System.out.printf("A=%.4f ", A);
        */

        // Exercício 03 -> DIFERENCA = (A * B - C * D).
        /*
        int A, B, C, D, difference;

        System.out.println("Entrada:");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        difference =  ((A * B) - (C * D));

        System.out.println("Saída:");
        System.out.println("DIFERENCA = " + difference);
        */

        // Exercício 04 -> SALÁRIO = NÚMERO DE HORAS TRABALHADAS * VALOR POR HORA
        /*
        int employees;
        double S, H, V;
        System.out.println("Entrada:");
        employees = sc.nextInt();
        H = sc.nextDouble();
        V = sc.nextDouble();

        S = H * V;

        System.out.println("Saída:");
        System.out.println("NUMBER = " + employees);
        System.out.printf("SALARY = U$ %.2f" , S);
        */

        // Exercício 05 -> ValorTotal = (CódigoPeça1 * ValorUnitário1) + (CódigoPeça2 * ValorUnitário2)
        /*
        int c1, c2, n1, n2;
        double uv1, uv2, amount;

        System.out.println("Entrada:");
        c1 = sc.nextInt();
        n1 = sc.nextInt();
        uv1 = sc.nextDouble();

        c2 = sc.nextInt();
        n2 = sc.nextInt();
        uv2 = sc.nextDouble();

        amount = (n1 * uv1) + (n2 * uv2);

        System.out.println("Saída:");
        System.out.printf("VALOR A PAGAR: R$ %.2f" , amount);
        */

        // Exercício 06
        double pi, A, B, C, TRIANGLE, CIRCLE, TRAPEZIO, SQUARE, RECTANGULE;
        pi = Math.PI;

        System.out.println("Entrada:");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        TRIANGLE = (1.0/2.0) * (A * C);
        CIRCLE = pi * (Math.pow(C, 2.0));
        TRAPEZIO = (1.0/2.0) * (A + B) * C;
        SQUARE = Math.pow(B, 2.0);
        RECTANGULE = A * B;

        System.out.println("Saída:");
        System.out.printf("TRIANGULO: %.3f%n" , TRIANGLE);
        System.out.printf("CICULO: %.3f%n" , CIRCLE);
        System.out.printf("TRAPEZIO: %.3f%n" , TRAPEZIO);
        System.out.printf("QUADRADO: %.3f%n" , SQUARE);
        System.out.printf("RETANGULO: %.3f%n" , RECTANGULE);

        sc.close();
    }

}
