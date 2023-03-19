package guess_my_number;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessMyNumberVar2 {
    public static void main(String[] args) {
        guess();
    }

    static void guess() {
        Scanner scanner = new Scanner(System.in);

        int min = 1;
        int max = 100;
        String input;

        System.out.println("The GAME! Try to guess my number. The range is from 1 to 20. Let's start!");
        while (true) {
            int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
            System.out.println("the number is: " + randomNumber);
            System.out.println("comment: ");
            input = scanner.next();

            if (input.equals("higher")) {
                min = randomNumber + 1;
            } 
            else if (input.equals("lower")) {
                max = randomNumber - 1;
            }
            else if (input.equals("correct")) {
                System.out.println("correct");
                break;
            }


        }
        }


    }