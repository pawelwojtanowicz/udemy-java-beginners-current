package loops;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String again;

        do {
            int num = ThreadLocalRandom.current().nextInt(1,7);
            System.out.println("the random number is: " + num   );
            System.out.println("roll again y/n? ");
            again = scanner.next();
        } while (again.equals("y"));

        //modulo
        System.out.println(15 % 3); // --> 0 - nie ma reszty, 15 jest podzilene przez


    }
}