// Estruturas repetitivas, while, for, do-while
package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        // Testando o Debug
        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);
        */

        /*
        // Exemplo com while
        System.out.println("ENTRADA:");
        int inputNumber = sc.nextInt();

        int sum = 0;
        while(inputNumber != 0) {
            sum += inputNumber;
            inputNumber = sc.nextInt();

        }
        System.out.println("SAÍDA:");
        System.out.println(sum);
        */

        /*
        // Exemplo com for
        int N = sc.nextInt();

        int sum = 0;
        for (int i=0; i<N; i++) {
            int inputNumber = sc.nextInt();
            sum += inputNumber;
        }
        System.out.println(sum);
        */


        // Exemplo com do-while
        char resp;
        do {
            System.out.println("Digite a temperatura em Celsius:");
            double C = sc.nextDouble();
            double F = 9*C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)?");
            resp = sc.next().charAt(0);
        } while (resp != 'n');



        sc.close();

    }
}
