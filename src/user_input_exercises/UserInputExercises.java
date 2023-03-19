package user_input_exercises;

import java.util.Scanner;
import java.util.SplittableRandom;

public class UserInputExercises
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("First name: ");
        String userFirstName = scanner.nextLine();

        System.out.print("Age: ");
        int userAge = scanner.nextInt();

        System.out.print("Amount money in your pocket: ");
        double userMoney = scanner.nextDouble();

        System.out.print("Restaurant bill: ");
        double usersBill = scanner.nextDouble();

        System.out.print("How many people did eat in this restaurant: ");
        int usersAmount = scanner.nextInt();

        String exercise1 = String.format("Your name is %s. You've lived %d years. In another %d years you'll be %d years old.", userFirstName, userAge, userAge, 2*userAge);
        System.out.println(exercise1);

        double howMuchForEachPerson = usersBill / usersAmount;
        String exercise2 = String.format("Each person has to pay %.2f.", howMuchForEachPerson);
        System.out.println(exercise2);


    }

}
