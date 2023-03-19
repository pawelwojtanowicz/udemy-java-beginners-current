package quiz_questions;

import java.util.Scanner;

public class QuizQuestions {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\n---This is a quiz with 3 questions---");
        System.out.println("Please note: answer \"true\" or \"false\".\n");

        String[] questions = new String[3];
        questions[0] = "Is Warsaw a capital of Poland? ";
        questions[1] = "Is the human a mammal? ";
        questions[2] = "Is the Amazon a lake? ";

        String[] order = {"first", "second", "third"};

        boolean[] correctAnswers = {true, true, false};

        boolean[] playerAnswers = new boolean[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("The " + order[i] + " question is: ");
            System.out.print(questions[i]);
            playerAnswers[i] = scanner.nextBoolean();
        }


        int[] results = new int[3];
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            if (playerAnswers[i] == correctAnswers[i])
                results[i] = 1;
            else
                results[i] = 0;
        }

        for (int i = 0; i < 3; i++)
            sum += results[i];


        System.out.println("\nYour result: ");
        for (int i = 0; i < 3; i++)
            System.out.println("Question " + (i + 1) + ": " + results[i]);

        System.out.println("Total score: " + sum + " / 3");
    }
}