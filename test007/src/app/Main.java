// Sintaxe opcional - operadores de atribuição cumulativa; switcg-case; condição ternária
package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Exemplo 01 -> Utilizando operadores de atribuição cumulativa
        /*
        int minutos = sc.nextInt();
        double conta = 50.00;
        if(minutos > 100 ) {
            //conta = conta + (minutos - 100) * 2.0;
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor a apagar: R$ %.2f%n", conta);
        */
        // Exemplo 02 -> Utilizando switcg-case
        /*
        System.out.println("ENTRADA:");
        int x = sc.nextInt();

        String dia;
        System.out.println("SAIDA:");
        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "valor invalido";
                break;
        }
        System.out.println("Dia da semana: " + dia);
         */
        // Exemplo 03 -> Utilizando condição ternária
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);

        sc.close();
    }
}
