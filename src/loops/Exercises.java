package loops;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercises {
    public static void main(String[] args) {

        Exercise1();
        Exercise2();
        Exercise3();
        Exercise4();
        Exercise5();

    }

    static void Exercise1() {

        for (int i = 89; i <= 117; i++) {
            System.out.println(i);
        }

    }

    static void Exercise2() {

        int i = 1;

        do {
            System.out.println(i);
            if (i % 3 == 0) {
                System.out.println("Kwa");
            }
            i++;
        } while (i <= 40);


    }

    static void Exercise3() {

        Scanner scanner = new Scanner(System.in);

        String password;

        do {
            System.out.print("Enter your password: ");
            password = scanner.next();
            if (password.equals("shark50"))
                System.out.println("access approved");

        } while (!password.equals("shark50"));


    }

    static void Exercise4() {

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

    }

    static void Exercise5() {

        Scanner scanner = new Scanner(System.in);

        int randomNumber;
        int playerNumber;
        int counter = 0;

        do {
            System.out.print("Pick a number: ");
            playerNumber = scanner.nextInt();
            counter++;
            randomNumber = ThreadLocalRandom.current().nextInt(1, 5);


            System.out.println("your number: " + playerNumber);
            System.out.println("random number: " + randomNumber);

            if (playerNumber > randomNumber)
                System.out.println("too high");
            else if (playerNumber<randomNumber) {
                System.out.println("too low");
            }
            else{
                System.out.println("correct");
                System.out.println("you guessed in " + counter + " trials, bravo");
            }

        } while (playerNumber != randomNumber);

    }
}