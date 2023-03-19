package coding_challenges_to_8_section;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CodingChallenges_to_8_section {
    public static void main(String[] args) {
        ex14();
    }

    static void ex14() {
        Scanner scanner = new Scanner(System.in);

        String[] foods = new String[3];
        String[] orderNumber = {"first", "second", "third"};

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter your " + orderNumber[i] + " favorite food: ");
            foods[i] = scanner.nextLine();
        }
        System.out.println("Sorry, too less memory for next positions.");
        System.out.println("Yor list: ");
        for (int i = 0; i < foods.length; i++) {
            System.out.print(i + 1 + ". " + foods[i] + ", ");

        }
        System.out.format("\b\b.");
    }

    static void ex13() {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        double mean;

        for (int i = 0; i < numbers.length; i++)
            sum += numbers[i];

        mean = sum / numbers.length;

        System.out.println("sum: " + sum);
        System.out.println("mean: " + mean);
    }

    static void ex12() {
        int[] numbers = new int[20];

        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = i + 1;

        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);

        }

    }

    static void ex11() {
        int[] numbers = {1, 2, 3, 4};

        for (int index : numbers) {
            System.out.println(index);
        }
    }

    static void ex10() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The GAME! Let's start!");
        System.out.println();

        int playerNumber;
        int randomNumber;
        int counter = 0;
        randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
        do {
            System.out.print("Choose the number from 1 to 5: ");
            playerNumber = scanner.nextInt();
            ++counter;

            if (playerNumber > randomNumber)
                System.out.println("it's too high");
            else if (playerNumber < randomNumber) {
                System.out.println("it's too low");
            }

        } while (playerNumber != randomNumber);

        System.out.println("correct! bravo!");
        System.out.println("you made it in " + counter + " guesses");
    }

    static void ex9() {
        String end1 = ", ";
        String end2 = ".";

        for (int i = 0; i <= 10; i++)
            if (i == 10) {
                System.out.print(i + end2);
            } else
                System.out.print(i + end1);

    }

    static void ex8() {
        Scanner scanner = new Scanner(System.in);

        String correctPassword = "shark50";
        String userPassword;

        do {
            System.out.println("Enter your password: ");
            userPassword = scanner.next();
        } while (!userPassword.equals(correctPassword));

        System.out.println("The password is correct");

    }

    static void ex7() {
        int i = 1;
        do {
            System.out.println(i);
            if (i % 3 == 0)
                System.out.println("Kwa!");
            i++;
        } while (i <= 40);
    }

    static void ex6() {
        for (int i = 89; i <= 117; i++) {
            System.out.println(i);
        }
    }

    static void ex5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pick the number form 1 to 2: ");
        int playerNumber = scanner.nextInt();
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 3);

        System.out.println("your number is: " + playerNumber);
        System.out.println("random number is: " + randomNumber);

        if (playerNumber == randomNumber) {
            System.out.println("correct");
        } else {
            System.out.print("your second chance: ");
            playerNumber = scanner.nextInt();

            if (playerNumber == randomNumber) {
                System.out.println("correct");
            } else
                System.out.println("maybe next time");
        }
    }

    static void ex4() {
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;

        System.out.print("enter x value: ");
        x = scanner.nextInt();
        System.out.print("enter y value: ");
        y = scanner.nextInt();
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        if (x < y)
            System.out.println("x is smaller than y");
        else if (y < x) {
            System.out.println("x is bigger than y");
        } else
            System.out.println("x & y are the same");

        if (x < y)
            System.out.println("y - x = " + (y - x));
        else if (y < x)
            System.out.println("x - y = " + (x - y));
        else
            System.out.println();


    }

    static void ex3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total restaurant bill: ");
        double totalBill = scanner.nextDouble();
        System.out.print("Number of people joined the dinner: ");
        int people = scanner.nextInt();
        System.out.format("Each person has to pay: %.2f", (totalBill / people));
    }

    static void ex2() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String name = scanner.next();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your first name has " + name.length() + " characters.");
        System.out.println("In another " + age + " years you will be " + (age * 2) + " years old.");

    }

    static void ex1() {
        System.out.println("SHOPPING LIST\n\t- Milk\n\t\t> Semi-skimmed\n\t\t> Medium\n\t- Eggs\n\t\t> Free-range\n\t- Eggs");
        System.out.println("--------");
        System.out.println("SHOPPING LIST");
        System.out.println("\t- Milk");
        System.out.println("\t\t> Semi-skimmed");
        System.out.println("\t\t> Medium");
        System.out.println("\t- Eggs");
        System.out.println("\t\t> Free-range");
        System.out.println("\t- Eggs");
        System.out.println("--------");
        System.out.println("The");
        System.out.println("\tCake");
        System.out.print("Is");
        System.out.println("\t\tA");
        System.out.println("\tLie.");


    }
}