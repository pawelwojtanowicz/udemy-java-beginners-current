package loops;

public class BreakContinue {
    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++) {
            if (i == 3)
                break; // break wychodzi z pętli for gdy i=3 i kończy ją
            System.out.println(i);

        }

        for (int i = 1; i <= 5; i++) {
            if (i == 3)
                continue; // continue przeskakuje tylko z jednej iteracji, tutaj --> gdy i=3
            System.out.println(i);

        }


    }
}