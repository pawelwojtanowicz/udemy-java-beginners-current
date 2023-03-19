package if_statement;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("The VIP Lounge");

        System.out.print("Age: ");
        int age = scanner.nextInt();


        if (age > 18) {
            System.out.print("Do you have a VIP pass? (yes / no): ");
            String vipPassReplay = scanner.next();
            if (age >= 70 || vipPassReplay.equals("yes"))
                System.out.println("Go on!");
            else
                System.out.println("You have to be at least 70 or have na VIP pass");
        } else
            System.out.println("Access denied");
    }
}