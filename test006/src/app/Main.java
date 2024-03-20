// Estrutura condicional (if-else)
package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int hours;
        System.out.println("Quantas horas? ");
        hours = sc.nextInt();

        if (hours < 12) {
            System.out.println("Good morning!");

        } else if (hours < 18) {
            System.out.println("Good afternoon!");

        } else {
            System.out.println("Goodnight!");
        }

        sc.close();
    }
}
