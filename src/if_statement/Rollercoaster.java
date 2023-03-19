package if_statement;

import java.util.Scanner;

public class Rollercoaster {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Rollercoaster.");
        System.out.print("Please enter your height in centimetres: ");
        int height = scanner.nextInt();

        if(height < 130)
            System.out.println("Sorry, you are too short.");
        else if (height > 210)
            System.out.println("Sorry, you are too tall.");
         else
            System.out.println("Height accepted - go ahead!");

         anotherWay();
         secondAnotherWay();

    }

    static void anotherWay() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Rollercoaster.");
        System.out.print("Please enter your height in centimetres: ");
        int height = scanner.nextInt();

        if(height < 130 || height > 210)
            System.out.println("Sorry, your height doesn't meet the requirements.");
        else
            System.out.println("Height accepted - go ahead!");

    }

    static void secondAnotherWay() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Rollercoaster.");
        System.out.print("Please enter your height in centimetres: ");
        int height = scanner.nextInt();

        if(height > 130 && height < 210)
            System.out.println("Height accepted - go ahead!");
        else
            System.out.println("Sorry, your height doesn't meet the requirements.");

    }
}