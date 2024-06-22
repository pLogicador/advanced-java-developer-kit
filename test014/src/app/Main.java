package app;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        // Solução problema 01
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i=0; i<n; i++) {
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for(int i=0; i<n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;
        System.out.printf("AVERAGE HEIGHT = %.2f%n", avg);
        */
        // Solução problema 02
        int n = sc.nextInt();

        Product[] vect = new Product[n];
        for (int i=0; i<vect.length; i++) {
            sc.nextLine(); // Consome a quebra de linha não dada
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i=0; i<vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum/vect.length;
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}
