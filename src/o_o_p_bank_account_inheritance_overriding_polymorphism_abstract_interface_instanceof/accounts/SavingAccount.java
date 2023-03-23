package o_o_p_bank_account_inheritance_overriding_polymorphism_abstract_interface_instanceof.accounts;

public class SavingAccount extends Account{
    public SavingAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

    @Override
    public boolean withdraw(double amount) {
        double fee = 0.025 * amount;
        amount += fee;

//        if(amount > balance){
//            return false;
//        }
//        balance -= amount;
//        return true;

        return super.withdraw(amount);//this is instead the lines 13-17


    }
}