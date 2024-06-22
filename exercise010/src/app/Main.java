package app;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employee will be registered? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("\nEmployee #" + (i+1) + ":");
            System.out.print("id: ");
            Integer id = sc.nextInt();

            while (hasId(list, id)) {
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            System.out.print("name: ");
            sc.nextLine();  // Clearing the input buffer
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);
            list.add(employee);
        }
        System.out.print("\nEnter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();

        Employee employee = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        //Integer pos = position(list, idSalary);

        if(employee == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();

            employee.increaseSalary(percent);
        }
        System.out.println("\nList of employees:\n");
        for(Employee e : list) {
            System.out.println(e);
        }

        sc.close();
    }
    public static Integer position(List<Employee> list, int id) {
        for(int i=0; i<list.size(); i++) {
            if(list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
    public static boolean hasId(List<Employee> list, int id) {
        Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return employee != null;
    }

}
