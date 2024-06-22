// Exercícios da seção 08
package app;

import entities.CurrencyConverter;
import entities.Employee;
import entities.Rectangle;
import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*
        // Solução do problema 01
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("AREA = %.2f", rectangle.area());
        System.out.printf("\nPERIMETER = %.2f", rectangle.perimeter());
        System.out.printf("\nDIAGONAL = %.2f", rectangle.diagonal());
         */

        /*
        // Solução 02
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("\nEmployee: " + employee);
        System.out.print("\nWhich percentage to increase salary? ");
        double percentage = sc.nextDouble();

        employee.increaseSalary(percentage);
        System.out.println("\nUpdated data: " + employee);
        */
        /*
        // Solução 03
        Student student = new Student();

        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f", student.finalGrade());
        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingFails());
        } else {
            System.out.println("\nPASS");
        }
        */
        // Solução 04
        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
        System.out.printf("Amount to be paid in reais = %.2f%n", result);

        sc.close();
    }
}
