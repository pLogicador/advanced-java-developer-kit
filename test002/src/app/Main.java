// Processamento de dados: Comandos de atribuição, Casting
package app;

public class Main {
    public static void main(String[] args) {
        /*
        // Exemplo 1
        int x, y;
        x = 5;
        y = 2 * x;  // conversão automática para um resultado double

        System.out.println(x);
        System.out.println(y);
        */
        /*
        // Exemplo 2
        int x;
        double y;
        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);
        */
        /*
        // Exemplo 3 Boa prática:
        // Utilize 'f' após os valores quando for do tipo float;
        // Utilize '.0' após os valores quando for do tipo double

        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B) / 2.0 * h;

        System.out.println(area);
        */
        /*
        // Exemplo 4 Casting: conversão exlplícita dos valores
        int a, b;
        double resultado;

        a = 5;
        b = 2;

        resultado = (double) a / b; // Para evitar o truncamento das casas decimais

        System.out.println(resultado);
        */
        // Exemplo 5 Problema comum onde o compilador acha que vai perder informação
        double a;
        int b;

        a = 5.0;
        b = (int) a; // Pois não podemos converter de 'double' para 'int'

        System.out.println(b);

    }
}
