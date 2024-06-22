package app;

import entities.Person;

import javax.swing.text.html.HTMLDocument;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        // Solução para "negativos"
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        for (int i=0; i<vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");

        for(int i=0; i<vect.length; i++) {
            if (vect[i] < 0) {
                System.out.printf("%d\n", vect[i]);
            }
        }
        */
        /*
        // Solução para "soma-vector"
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double sum = 0.0;
        double[] vect = new double[n];
        for (int i=0; i<vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        double average = sum / n;
        System.out.print("VALORES = ");
        for (int i=0; i<vect.length; i++) {
            System.out.printf("%.1f ", vect[i]);
        }
        System.out.printf("\nSOMA = %.2f", sum);
        System.out.printf("\nMEDIA = %.2f", average);
        */
        /*
        // Solução para "alturas"
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Person[] person = new Person[n];
        for (int i=0; i<person.length; i++) {
            System.out.println("Dados da " + (i+1) + "ª pessoa:");
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();

            person[i] = new Person(name, age, height);
        }
        double average = Person.calculateAverageHeight(person);
        double percentage = Person.calculatePercentageUnder16(person);

        System.out.printf("\nAltura média: %.2f", average);
        System.out.printf("%nPessoas com menos de 16 anos: %.1f%%%n", percentage);
        for(int i=0; i<person.length; i++) {
            if(person[i].getAge() < 16) {
                System.out.println(person[i].getName());
            }
        }
        */
        /*
        // Solução para "numeros_pares"
        System.out.print("Quantos numeros serao digitadas? ");
        int n = sc.nextInt();

        int qtdPares = 0;
        int[] vect = new int[n];
        for (int i=0; i<vect.length; i++) {
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();
            if(num%2 == 0) {
                vect[qtdPares] = num;
                qtdPares++;
            }
        }

        System.out.println("NUMEROS PARES: ");
        for(int i=0; i<qtdPares; i++) {
            System.out.printf("%d ", vect[i]);
        }
        System.out.println("\nQUANTIDADE DE PARES = " + qtdPares);
        */
        /*
        // Solução para "maior_posicao"
        System.out.print("Quantos numeros serao digitadas? ");
        int n = sc.nextInt();

        double bigger = Double.MIN_VALUE;
        double[] vect = new double[n];
        int position = -1;

        for (int i=0; i<vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();

            if(vect[i] > bigger) {
                bigger = vect[i];
                position = i;
            }
        }

        System.out.printf("%nMAIOR VALOR = %.1f%n", bigger);
        System.out.printf("POSICAO DO MAIOR VALOR = %d%n", position);
        */
        /*
        // Solução para "soma_vetores"
        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B:");
        for(int j=0; j<n; j++) {
            b[j] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor C:");
        for(int k=0; k<n; k++) {
            c[k] += a[k] + b[k];
        }
        System.out.println("VETOR RESULTANTE:");
        for (int l=0; l<n; l++) {
            System.out.println(c[l]);
        }
        */
        /*
        // Solução para "abaixo_da_media"
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double sum = 0.0;
        double[] vect = new double[n];
        for(int i=0; i<vect.length; i++) {
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }
        double average = sum / (vect.length);
        System.out.printf("MEDIA DO VETOR = %.3f%n", average);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for(int j=0; j<vect.length; j++) {
            if (vect[j] < average) {
                System.out.printf("%.1f%n", vect[j]);
            }
        }
        */
        /*
        // Solução para "media_pares"
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int sumPar = 0;
        int countPar = 0;
        int[] vect = new int[n];
        for(int i=0; i<vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
            if (vect[i]%2 == 0) {
                sumPar += vect[i];
                countPar++;
            }
        }

        if (countPar == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            double averagePar = (double) sumPar / countPar;
            System.out.printf("MEDIA DOS PARES = %.1f%n", averagePar);
        }
        */
        /*
        // Solução para "mais_velho"
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];
        int bigger = age[0];
        int biggerPosition = 0;

        for(int i=0; i<n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa");
            System.out.print("Nome: ");
            name[i] = sc.next();
            System.out.print("Idade: ");
            age[i] = sc.nextInt();

            if (age[i] > bigger) {
                bigger = age[i];
                biggerPosition = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s\n", name[biggerPosition]);
        */
        /*
        // Solução para "aprovados"
        System.out.print("Quantos alunos serao digitados?  ");
        int n = sc.nextInt();

        String[] name = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];
        double avg = 0.0;
        
        for(int i=0; i<n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno: ");
            sc.nextLine();
            name[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }
        System.out.println("Alunos aprovados:");
        for(int i=0; i<n; i++) {
            avg = (nota1[i] + nota2[i] / 2);
            if (avg >= 6.0) {
                System.out.printf("%s\n", name[i]);
            }
        }
        */
        // Solução para "dados_pessoas"
        System.out.print("Quantas pessoas serao digitados?  ");
        int n = sc.nextInt();

        char[] genero = new char[n];
        double[] altura = new double[n];
        double menoraltura = altura[0];
        double maioraltura = altura[0];
        double totalAlturaM = 0.0;
        int countH = 0;
        int countM = 0;

        for(int i=0; i<n; i++) {
            System.out.printf("Altura da %da pessoa? ", i+1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i+1);
            genero[i] = sc.next().charAt(0);

            if(altura[i] < menoraltura) {
                menoraltura = altura[i];
            } else if (altura[i] > maioraltura) {
                maioraltura = altura[i];
            }
            if (genero[i] == 'M') {
                countH++;
            } else {
                countM++;
                totalAlturaM += altura[i];
            }
        }


        double mediaAlturaM = totalAlturaM / countM;

        System.out.printf("Menor altura = %.2f%n", menoraltura);
        System.out.printf("Maior altura = %.2f%n", maioraltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaM);
        System.out.printf("Numero de homens = %d%n",countM);

        sc.close();
    }
}
    