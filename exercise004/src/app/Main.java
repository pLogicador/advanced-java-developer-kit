// Exercícios relacionados a estrutura repetitiva while
package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        // Exercício resolvido 01 URI 1113
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != y) {
            if (x > y) {
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        */

        // Exercício resolvido 02
        double idade = sc.nextDouble();

        int total = 0;
        int contador = 0;

        while (idade >= 0) {
            total += idade;
            contador++;

            idade = sc.nextDouble();
        }

        if (contador > 0 ) {
            double media = (double) total / contador; // evitando truncamento
            System.out.printf("%.2f%n", media);
        } else {
            System.out.println("Impossível calcular");
        }

        /*
        // Exercicio proposto 01
        int password = sc.nextInt();

        while(password != 2002) {
            System.out.println("Senha Invalida");
            password = sc.nextInt();
        }

        System.out.println("Acesso Permitido");
        */
        /*
        // Exercicio proposto 02
        int x = sc.nextInt();
        int y = sc.nextInt();

        while(x != 0 && y != 0) {
            if ( x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        */
        /*
        // Exercicio proposto 03
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int tipo = sc.nextInt();
        while (tipo != 4) {
            if (tipo == 1) {
                alcool += 1;
            } else if (tipo == 2){
                gasolina += 1;
            } else if (tipo == 3) {
                diesel += 1;
            }

            tipo = sc.nextInt();
        }
        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        */
        sc.close();
    }
}
