package class_variable;

import java.util.Scanner;

public class ClassVariable {
    static Scanner scanner = new Scanner(System.in); //this scanner will be available in every method in ClassVariable class
    static int x = 10; //available in main and somethingAls methods
    //remember to add static before declaring

    public static void main(String[] args) {
        String local1 = scanner.next();

        System.out.println(x);
        x = 1;
        somethingAls();
    }

    public static void somethingAls() {
        String local2 = scanner.next();
        System.out.println(x); //here x is 1 because we changed it in main method
        x = 2;

    }
}