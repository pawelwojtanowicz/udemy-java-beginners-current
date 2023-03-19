package o_o_p_door;

public class CarDoor {

    // State of this class
    String name;
    boolean isOpen; //NOTE: the default value for boolean is false


    //Behaviour of this class
    void open() {
        isOpen = true;
    }

    void close() {
        isOpen = false;
    }

    void printStatus() {
        if (isOpen) {
            System.out.println(name + " door is open.");
        } else {
            System.out.println(name + " door is closed.");
        }
    }


}