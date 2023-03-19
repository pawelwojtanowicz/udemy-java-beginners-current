package if_statement;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercises {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Comparison engine.");
//        System.out.print("Please enter your first number (x): ");
//        int x = scanner.nextInt();
//        System.out.print("Please enter your second number (y): ");
//        int y = scanner.nextInt();
//        int difference = x - y;
//
//        if (x > y)
//            System.out.println("x is bigger than y");
//        else if (y > x)
//            System.out.println("y is bigger than x");
//        else
//            System.out.println("x and y are the same");
//
//        System.out.println("the difference between x and y is: " + difference);

        game();

    }

    static void game() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Game.");
        System.out.print("Please enter your number (range: 1-5): ");
        int pickedNumber = scanner.nextInt();

        int randomNumber = ThreadLocalRandom.current().nextInt(1,6);

        System.out.println("You've picked: " + pickedNumber);
        System.out.println("The random number is: " + randomNumber);

        if(pickedNumber == randomNumber)
            System.out.println("Correct! Aren’t you lucky.");
        else{
            System.out.println("Take the second chance: ");
            pickedNumber = scanner.nextInt();
            randomNumber = ThreadLocalRandom.current().nextInt(1,6);
            System.out.println("You've picked: " + pickedNumber);
            System.out.println("The random number is: " + randomNumber);
            if (pickedNumber == randomNumber)
                System.out.println("Correct! Aren’t you lucky.");
            else
                System.out.println("Hard luck! Maybe next time.");
        }

    }


}