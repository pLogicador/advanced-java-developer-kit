// Entrada de dados - Parte 2
package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        // Exemplo 1
        String s1, s2, s3;

        // Para ler um texto até a quebra de linha
        s1 = sc.nextLine(); // Lendo a linha inteira
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println(s1);
        System.out.println(s2);
        */
        /*
        // Exemplo 2 Problema
        int x;
        String s1, s2, s3;

        x = sc.nextInt();   // A quebra de linha aqui está pendente na entrada padrão
        s1 = sc.nextLine(); // 'nextLine()' consumiu a quebra de linha pendente
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        */
        // Solução 1
        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        sc.close();
    }
}
