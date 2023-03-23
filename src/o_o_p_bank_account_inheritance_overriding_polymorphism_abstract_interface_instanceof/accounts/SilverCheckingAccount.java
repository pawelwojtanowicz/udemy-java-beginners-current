package o_o_p_bank_account_inheritance_overriding_polymorphism_abstract_interface_instanceof.accounts;

public class SilverCheckingAccount extends CheckingAccount{
    public SilverCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }


    //Override --> 'zastepowanie' istniejacej juz metody z Parenta ale np. zmodyfikowanej w jakiś sposob
    @Override
    public int rewardPointCalc(double cost) {
        return (int) (cost * 25);
    }
}