package o_o_p_bank_account_inheritance_overriding_polymorphism_abstract_interface_instanceof.accounts;

public class Account {

    protected double balance;
    private double interestRate;


    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public boolean withdraw(double amount){

        if (amount > balance){
            return false;
        }

        balance -= amount;
        return true;

    }

    public void deposit(double amount){
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void status(){
        System.out.printf("Balance: %.2f\n", balance);
    }
}