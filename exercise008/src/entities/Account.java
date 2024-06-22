package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    // Constructor class
    public Account(int number, String holder, double initialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Account(int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    // Getters and Setters
    public int getNumber(){
        return number;
    }

    public String getHolder(){
        return holder;
    }
    public void setHolder(String holder){
        this.holder = holder;
    }

    // Methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public String toString(){
        return "Account: " + number +
                ", Holder: " + holder +
                ", Balance: $ " + String.format("%.2f", balance);
    }

}
