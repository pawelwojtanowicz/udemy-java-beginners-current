package o_o_p_bank_account_inheritance_overriding_polymorphism_abstract_interface_instanceof;


import o_o_p_bank_account_inheritance_overriding_polymorphism_abstract_interface_instanceof.accounts.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //---polymorphism (many forms)-------------------------------------------------

        Account account = new Account(100, 23); // Account variable which holds an Account object

        //but variable can hold object of any subtype, here: CheckingAccount, SavingAccount, Silver... etc.
        Account account1 = new SavingAccount(500, 0.3);
        CheckingAccount account2 = new GoldCheckingAccount(300, 0.3, 34);
        Account account3 = new SilverCheckingAccount(280,0.029,1770);

        //account1.purchase();  --> not available because Account does not have a purchase method, JAVA only looks at the variable type which is Account in this case
        // JAVA doesn't know what additional members that object (eg. CheckingAccount) has so methods outside are not available

        account1.status();
        account1.withdraw(90);//here: account1 is type Account but the actual object is a SavingAccount, so this will call withdraw method from SavingAccount
        //JAVA calls the method based on the object type, not tje variable type
        //the variable type (here: Account) determines what method can be called, but the object type (here: SavingAccount) determines what version of te method is called
        account1.status();

        account3.status(); //here: print status but in form like in CheckingAccount class where status method is Override

        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new SilverCheckingAccount(459, 0.23, 345));
        accounts.add(new DiamondCheckingAccount(459, 0.23, 345));
        accounts.add(new SavingAccount(459, 0.23));
        accounts.add(new GoldCheckingAccount(459, 0.23, 345));
        accounts.add(new CheckingAccount(459, 0.23, 345));
        accounts.add(new Account( 0.23, 345));

        for(Account account4 : accounts){
            account4.status();
            System.out.println();
        }


        //---polymorphism (many forms)-------------------------------------------------



        SilverCheckingAccount silverCheckingAccount = new SilverCheckingAccount(5000, 0.025, 1000);
        GoldCheckingAccount goldCheckingAccount = new GoldCheckingAccount(5000, 0.025, 1000);
        DiamondCheckingAccount diamondCheckingAccount = new DiamondCheckingAccount(5000, 0.025, 1000);

        System.out.println(silverCheckingAccount.getRewardPoints());
        System.out.println(goldCheckingAccount.getRewardPoints());
        System.out.println(diamondCheckingAccount.getRewardPoints());

        silverCheckingAccount.purchase(50);
        goldCheckingAccount.purchase(50);
        diamondCheckingAccount.purchase(50);

        System.out.println(silverCheckingAccount.getRewardPoints());
        System.out.println(goldCheckingAccount.getRewardPoints());
        System.out.println(diamondCheckingAccount.getRewardPoints());


    }


}