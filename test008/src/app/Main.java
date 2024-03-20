// Escopo e inicialização
package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Toda variável precisa ser inicializada em JAVA
        // Qualquer estrutura de controle possui seu próprio escopo.
        double x = 20.0;
        double price = sc.nextDouble();

        double discount = 0; // Garante que a variável foi iniciada (e no corpo global)
        if (price < 200.00){
            discount = price * 0.01;
            System.out.println(discount);
        }

        System.out.println(x);
        System.out.println(price);
        System.out.println(discount);

        sc.close();
    }
}
