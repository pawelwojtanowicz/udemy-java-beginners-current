package samples_of_packages.scanner;

import java.util.Scanner;

public class ScannerSample
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String userName = scanner.next();
        System.out.print("How old are you? ");
        int userAge = scanner.nextInt();
        System.out.println("Your name is " + userName + " and you are " + userAge + " years old.");
        System.out.println("How tall are you (in metres): ");
        double userHigh = scanner.nextDouble();
        System.out.println("You are " + userHigh + " [m] tall.");
        System.out.println();
        System.out.println(4.5 - 2.7);
        double x = 4.5;
        double y = 2.7;
        System.out.println(x-y);
        System.out.format("I have %d cats, %d dogs and one %s Double numbers comparison: %f and %.1f", 7, 3, "fish.", 3.4, 3.4);

    }

}
