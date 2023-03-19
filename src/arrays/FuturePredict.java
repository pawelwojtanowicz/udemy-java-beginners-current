package arrays;

import java.util.Scanner;

public class FuturePredict {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] predictions = {"very rich.", "a pioneer.", "loved by many."};

        System.out.print("I'll will predict your future. Please choose number from 1 to 3: ");
        int number = scanner.nextInt();

        System.out.println("In the future you will be " + predictions[number-1]);

    }
}