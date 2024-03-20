// Seção 07 - Operadores bitwise
package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        // Exemplo 01
        int n1 = 89;
        int n2 = 60;
        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);
        */
        /*
        // Exemplo 02

        int mask = 0b100000; // or 32
        int inputNumber = sc.nextInt();

        if((inputNumber & mask) != 0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false!");
        }
        */
        /*
        // Exemplo 03   - Funções interessantes para Strings
        String original = "abcde FGHIJ ABC abc DEFG ";

        String s01 = original.toLowerCase();    // Retorna uma nova string com todos os caracteres em minúsculas.
        String s02 = original.toUpperCase();    // Retorna uma nova string com todos os caracteres em maiúsculas.
        String s03 = original.trim();           // Retorna uma nova string com os espaços em branco removidos do início e do fim da string original.
        String s04 = original.substring(2);     // Retorna uma nova string que é uma subcadeia da string original, começando do índice 'beginIndex'.
        String s05 = original.substring(2, 9);  // Retorna uma nova string que é uma subcadeia da string original, começando do índice 'beginIndex' até o 'índice endIndex - 1'.
        String s06 = original.replace('a', 'x');        // Retorna uma nova string onde todas as ocorrências do caractere 'oldChar' são substituídas pelo caractere 'newChar'.
        String s07 = original.replace("bBFG", "015K");  // Retorna uma nova string onde todas as ocorrências da sequência 'target' são substituídas pela sequência 'replacement'.

        int i = original.indexOf("bc"); // Retorna o índice da primeira ocorrência da substring 'str' dentro da string original, ou -1 se não for encontrada.
        int j = original.lastIndexOf("bc"); // Retorna o índice da última ocorrência da substring 'str' dentro da string original, ou -1 se não for encontrada.

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);
        */
        /*
        // Exemplo 04 - Função split

        String s = "potato apple lemon";  // Divide a string original em um array de strings, usando o regex fornecido como separador. Retorna um array de strings contendo as partes da string original divididas conforme o padrão fornecido.

        String[] vect = s.split(" ");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        */
        // Exemplo 05 - Funções (sintaxe): modularização, delegação e reaproveitamento
        System.out.println("Enter three numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int higher = max(x, y, z);
        showResult(higher);


        sc.close();
    }

    public static int max(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        }
        if (secondNumber > thirdNumber) {
            return secondNumber;
        }
        return thirdNumber;
    }

    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }


}
