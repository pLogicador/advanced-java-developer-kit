package app;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        /*
        Account acc = new Account( 1000, "George", 0.0);
        BusinessAccount bacc = new BusinessAccount(1001, "Maira", 0.0, 500.0);

        // Upcasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1002, "Jack", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1003, "Maria", 0.0, 0.01);

        // Downcasting
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        // avoid this mistake -> BusinessAccount acc5 = (BusinessAccount)acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount ) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
         */
        Account acc10 = new Account( 1010, "Jonas", 1000.0);
        acc10.withdraw(200.0);
        System.out.println(acc10.getBalance());



    }
}
