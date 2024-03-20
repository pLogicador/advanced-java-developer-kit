// Exercícios relacionados a estrutura repetitiva for
package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        // Exercício resolvido 01 URI 1078
        int n = sc.nextInt();

        for (int i=1; i<=10; i++) {
            int produto = i * n;
            System.out.println( i + " * " + n + " = " + produto);
        }
        */
        // Exercício resolvido 02 URI 1071 ?
        int x = sc.nextInt();
        int y = sc.nextInt();

        int min, max;
        if(x < y) {
            min = x;
            max = y;
        } else {
            min = y;
            max = x;
        }

        int soma = 0;
        for(int i=min+1; i<max; i++) {
            if(i%2 != 0) {
                soma += i;
            }
        }
        System.out.println(soma);

        /*
        // Exercício proposto 01
        int x = sc.nextInt();

        for (int i=1; i<=x; i++) {
            if (i%2 != 0) {
                System.out.println(i);
            }
        }
        */
        /*
        // Exercício proposto 02
        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i=0; i<n; i++) {
            int x = sc.nextInt();

            if (x >= 10 && x <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        */
        /*
        // Exercício proposto 03
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
            System.out.printf("%.1f%n", media);
        }
        */
        /*
        // Exercício proposto 04 ?
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("Divisão impossível");
            } else {
                double divisao = (double) x / y;
                System.out.printf("%.1f%n", divisao);
            }
        }
         */
        /*
        // Exercício proposto 05 ?
        int n = sc.nextInt();

        int fat = 1;
        for(int i=0; i<=n; i++){
            fat *= i;
        }
        System.out.println(fat);
        */
        /*
        // Exercício proposto 06
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            if (n%i == 0) {
                System.out.println(i);
            }
        }
        */
        /*
        // Exercício proposto 07 ?
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }
        */

        sc.close();
    }
}
