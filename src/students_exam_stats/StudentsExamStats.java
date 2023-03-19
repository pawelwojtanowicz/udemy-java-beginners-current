package students_exam_stats;

import java.util.Scanner;

public class StudentsExamStats {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\n--This is a program for a school to generate some statistic--\n");

        int studentsNumber;
        double examMaxScore;
        String print;

        System.out.print("Enter number of examined students: ");
        studentsNumber = scanner.nextInt();
        System.out.print("Enter max score of the exam: ");
        examMaxScore = scanner.nextInt();

        double[] scores = new double[studentsNumber];

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score of Student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }


        do {
            System.out.print("Enter \"print\" to display the results: ");
            print = scanner.next();
        } while (!print.equals("print"));

        for (int i = 0; i < scores.length; i++) {
            String eachStudentResult = String.format("- student %d scored %.1f / %.1f", (i + 1), scores[i], 100 * (scores[i] / examMaxScore));
            System.out.println(eachStudentResult + "[%]");

        }

        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

        }
        String mean = String.format("The mean result of the exam is: %.1f / %.1f", (sum / studentsNumber), 100 * ((sum / studentsNumber) / examMaxScore));
        System.out.println(mean + "[%]");


    }
}