/*Saída de Dados em JAVA*/
package app;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int y = 32;
        double x = 10.35784;
        String nome = "Ricardo";
        int idade = 22;
        double renda = 10000.0;

        System.out.println(y);
        System.out.println(x);

        // Controlando as casas decimais 'f' == formatado
        // o 'printf' pega o formato que estamos utilizando em nosso PC
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        Locale.setDefault(Locale.US);   // configura a localização do programa
        System.out.printf("%.4f%n", x);
        /*
        System.out.print("Vou ficar juntinho.");            // Sem quebra de linha ao final
        System.out.println("Vou pular uma linha ao final"); // Com quera de linha ao final
        */

        // Concatenando / Marcadores
        System.out.println("Resultado = " + x + " Metros");
        System.out.printf("Resultado = %.2f metros%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
