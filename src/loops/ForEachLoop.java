package loops;

public class ForEachLoop {
    public static void main(String[] args) {
        int da[] = new int[]{1, 2, 3, 4};


        for (int i = 0; i < da.length; i++) {
            int e = da[i];
            System.out.println(e);
        }


        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

        int db[] = new int[]{9, 8, 7, 6};
        for (int number : db) { //number holds each element form the array, that could be variable names like you want
            int f = number;     // this variable has to by on type like types in array
            System.out.println(f);
        }


    }
}