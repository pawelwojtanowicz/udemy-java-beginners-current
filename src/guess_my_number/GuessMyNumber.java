package guess_my_number;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessMyNumber {
    public static void main(String[] args) {
        guess();
    }
    static void guess() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The GAME! Try to guess my number. The range is from 1 to 20. Let's start!");
        System.out.println();

        String start;
        String endOrContinue;
        int randomNumber = 0;


        System.out.print("Guess the number when I type \"start\": ");
        start = scanner.next();
        if(start.equals("start")){
            randomNumber = ThreadLocalRandom.current().nextInt(1, 21);
            System.out.println(randomNumber);
        }

        endOrContinue = scanner.next();

        while (!endOrContinue.equals("correct")){
        if (endOrContinue.equals("higher")) {
            int randomNumberBuffer = randomNumber;
            randomNumber = ThreadLocalRandom.current().nextInt(randomNumberBuffer, 21);
            System.out.println(randomNumberBuffer);
            System.out.println(randomNumber);
            endOrContinue = scanner.next();
        } else if (endOrContinue.equals("lower")){
            int randomNumberBuffer = randomNumber;
            randomNumber = ThreadLocalRandom.current().nextInt(1, randomNumberBuffer + 1);
            System.out.println(randomNumberBuffer);
            System.out.println(randomNumber);
            endOrContinue = scanner.next();
        }
        else
            System.out.println("CORRECT! BRAVO!");
        }

    }

    }