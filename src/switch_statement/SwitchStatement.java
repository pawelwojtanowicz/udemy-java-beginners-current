package switch_statement;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the number: ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("you pressed 1");
                break;
            case 2:
                System.out.println("you pressed 2");
                break;
            case 3:
                System.out.println("you pressed 3");
                break;
            default:
                System.out.println("invalid number");
                break;
        }


    }
}