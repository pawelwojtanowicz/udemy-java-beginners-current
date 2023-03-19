package samples_of_packages.shopping_list;

public class ShoppingList {
    public static void main(String[] args) {
        System.out.println("SHOPPING LIST");
        System.out.println("\t- Milk");
        System.out.println("\t\t> Semi-skimmed");
        System.out.println("\t\t> Medium");
        System.out.println("\t- Eggs");
        System.out.println("\t\t> Free-range");
        System.out.println("\t- Bread");
        System.out.println("-----------------------\n-----------------------");
        System.out.println("SHOPPING LIST\n\t- Milk\n\t\t> Semi-skimmed\n\t\t> Medium\n\t- Eggs\n\t\t> Free-range\n\t- Bread");
        exercise3();

    }

    public static void exercise3() {
        System.out.println("The");
        System.out.println("\tCake");
        System.out.print("Is");
        System.out.println("\t\tA");
        System.out.println("\tLie.");
    }

    public static class InvokeMethodByAnotherMethod {
        public static void main(String[] args) {
            System.out.println("hello world_______1");
            System.out.println("hello world_______2");
            somethingAls();
        }

        public static void somethingAls() {
            System.out.println("pawel");
            System.out.println("aga");
        }
    }
}
