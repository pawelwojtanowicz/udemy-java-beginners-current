package o_o_p_bank_account_inheritance_overriding_polymorphism_abstract_interface_instanceof.accounts;

public class DiamondCheckingAccount extends CheckingAccount{
    public DiamondCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }

    @Override
    public int rewardPointCalc(double cost) {
        return (int) (Math.min(cost, 6000) * 70);
    }
}