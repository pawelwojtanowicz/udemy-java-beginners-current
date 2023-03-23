package o_o_p_bank_account_inheritance_overriding_polymorphism_abstract_interface_instanceof.accounts;

public class CheckingAccount extends Account {

    int rewardPoints;

    public CheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate); //calling super has to be always first
        this.rewardPoints = rewardPoints;

    }

    public boolean purchase(double cost) {
        if (cost > balance) {
            return false;
        }
        balance += cost;
        rewardPoints += rewardPointCalc(cost);
        return true;
    }

    public int rewardPointCalc(double cost){
        return (int) (cost * 10);
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    @Override
    public void status() {
        System.out.println("Checking Account");
        System.out.printf("\tBalance: %.2f\n", balance);
        System.out.printf("\tRewards points: %d\n", rewardPoints);
    }
}