package samples_of_packages.variables;

public class Variables {
    public static void main(String[] args) {
        int x = 10;
        double y = 5.5;
        System.out.println(x - y);
        System.out.println("-------------------");
        int z = 10;
        System.out.println(z);
        z = 46;
        System.out.println(z);
        z = -190;
        System.out.println(z);

        int a = 1;
        int b = 2;
        a = a + b + a;
        System.out.println("a= " + a);
        a = a + b + a;
        System.out.println("a= " + a);

        int c = 13;
        int d = 3;
        double e = 3;
        boolean isHeigh = false;
        char userInput = 169;
        String name = "John";
        System.out.println("division1 = " + c / d);
        System.out.println("division2 = " + c / e); // one of the variable (or both) should be double to get double result
        System.out.println("boolean = " + isHeigh);
        System.out.println(userInput);
        System.out.println(name);

    }
}