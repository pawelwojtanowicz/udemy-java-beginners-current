package arrays;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Exercise4();


    }

    static void Exercise4() {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = new String[3];

        System.out.println("This is an app where I asked you about your 5 favorite foods.");

        String[] orderNumbers = {"first", "second", "third"};
        int[] counter = new int[3];

        for (int i = 0; i < fruits.length; i++) {
            System.out.print("Please enter your " + orderNumbers[i] + " favorite food: ");
            fruits[i] = scanner.nextLine();
            counter[i] += i + 1;
        }
        System.out.println("Sorry, no more memory available.");
        System.out.println();
        System.out.println("You list is as follows:");

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(counter[i] + ". " + fruits[i]);
        }


    }

    static void Exercise3() {
        double[] numbers = {2.1, 2.2, 2.3, 2.4, 2.5};
        double sum = 0;


        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double mean = sum / numbers.length;
        System.out.println("sum = " + sum);
        System.out.println("mean = " + mean);

    }


    static void Exercise2() {
        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("------------");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

    }


    static void Exercise1() {

        int[] abc = {1, 3, 56, 234, 12, 89, 34, 983, 67, 345};

        for (int e : abc) {
            System.out.println(e);
        }

    }
}