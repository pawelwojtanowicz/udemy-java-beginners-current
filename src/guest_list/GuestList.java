package guest_list;

import java.util.Scanner;

public class GuestList {
    static Scanner scanner = new Scanner(System.in);
    static int option;

    public static void main(String[] args) {

        String[] guests = new String[10];
        insertTestNames(guests);


        do {

            displayMenu();

            if (option == 1) {
                displayGuests(guests);

            } else if (option == 2) {
                addGuests(guests);

            } else if (option == 3) {
                insertGuest(guests);

            } else if (option == 4) {
                removeGuestsVar2(guests);

            } else if (option == 5) {
                renameGuest(guests);

            } else if (option == 6) {
                break;
            }


        } while (true);


        System.out.println("Exiting...");
    }

    public static void displayMenu() {
        System.out.println("____________________________");
        System.out.println("---This is a guest list---");
        System.out.println("____________________________");
        System.out.println("Menu");
        System.out.println("1 - Display all guest.");
        System.out.println("2 - Add guest.");
        System.out.println("3 - Insert guest.");
        System.out.println("4 - Remove guest.");
        System.out.println("5 - Rename guest.");
        System.out.println("6 - Exit.\n");
        getOption();
    }

    public static void getOption() {
        System.out.println("Choose your option (1/2/3/4/5/6): ");
        option = scanner.nextInt();

    }

    public static void displayGuests(String[] guests) {

        System.out.println(">> Guests:");
        String[] temp = new String[10];
        int ti = 0;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                temp[ti] = guests[i];
                ti++;
            }
        }
        guests = temp;


        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                System.out.println((i + 1) + ". " + guests[i]);


            }

        }

        if (guests[0] == null) {
            System.out.println("No guests on the list yet.");
        }

    }

    public static void addGuests(String[] guests) {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.print("Add name: ");
                guests[i] = scanner.next();
                break;
            }
        }
    }

    public static void insertGuest(String[] guests){
        int position;
        String newName = "";
        do {
            System.out.println("Enter position: ");
            position = scanner.nextInt();
            if (position >= 1 && position <= 10 && guests[position - 1] != null) {
                break;
            } else
                System.out.println("Error. There is no guest with that number.");

        } while (true);

        System.out.println("New name: ");
        newName = scanner.next();

        for (int i = guests.length - 1;i>position - 1; i--){
            guests[i] = guests[i-1];
        }
        guests[(position - 1)] = newName;
    }

    public static void removeGuests(String[] guests) {
        System.out.println("Remove name: ");
        String name = scanner.next();

        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null && guests[i].equals(name)) {
                guests[i] = null;
                break;
            }
        }
    }


    public static void removeGuestsVar2(String[] guests) {
        int position;
        do {
            System.out.println("Remove position: ");
            position = scanner.nextInt();


            if (position >= 1 && position <= 10 && guests[position - 1] != null) {
                break;
            } else
                System.out.println("Error. There is no guest with that number.");
        } while (true);

        guests[(position - 1)] = null;
    }


    public static void insertTestNames(String[] guests) {
        guests[0] = "pawel";
        guests[1] = "aga";
        guests[2] = "ola";
        guests[3] = "kuba";
    }

    public static void renameGuest(String[] guests) {

        int position;
        String newName = "";
        do {
            System.out.println("Enter position: ");
            position = scanner.nextInt();
            if (position >= 1 && position <= 10 && guests[position - 1] != null) {
                break;
            } else
                System.out.println("Error. There is no guest with that number.");

        } while (true);

        System.out.println("New name: ");
        newName = scanner.next();
        guests[(position - 1)] = newName;


    }

}