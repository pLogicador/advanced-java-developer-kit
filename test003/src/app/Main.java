// Entrada de dados - Parte 1
package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // Associando o objeto 'Scanner' ao teclado no modo console
        Scanner sc = new Scanner(System.in);


        // Exemplo 1 Para String
        String a;
        a = sc.next(); // Permite a inserção de palavras e a armazena

        System.out.println("Você digitou: " + a);


        // Exemplo 2 Para int
        int b;
        b = sc.nextInt();

        System.out.println("Você digitou: " + b);

        // Exemplo 3 Para double
        double c;
        c = sc.nextDouble();    // Ele obtém a localidade do sistema

        System.out.println("Você digitou: " + c);

        // Exemplo 4 Para char
        char d;
        d = sc.next().charAt(0);    // o 'charAt(0)' pega o primeiro caractere do seu String

        System.out.println("Você digitou: " + d);

        // Exemplo 5 Para ler vários dados na mesma linha (separados por espaço)
        String e1;
        int e2;
        double e3;

        e1 = sc.next();
        e2 = sc.nextInt();
        e3 = sc.nextDouble();

        System.out.printf("Dados digitados: %s, %d, %.2f", e1, e2, e3);



        sc.close(); // Encerra o recurso que já foi utilizado

    }
}
