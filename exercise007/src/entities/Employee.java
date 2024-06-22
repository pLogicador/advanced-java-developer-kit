/*
1. Salário líquido:
Salário líquido = Salário bruto - Imposto

2. Novo salário bruto com base na porcentagem de aumento:
Novo salário bruto = Salário bruto * (1 + (porcentagem / 100))

3. Recálculo do salário líquido com base no novo salário bruto:
Novo salário líquido = Novo salário bruto - Imposto
*/
package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }
    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}
